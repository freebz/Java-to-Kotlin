// 예제 19.28 [errors.20:src/test/java/travelator/handlers/CustomerRegistrationHandlerTests.java]

public class CustomerRegistrationHandlerTests {

    final IRegisterCustomers registration =
        mock(IRegisterCustomers.class);
    final CustomerRegistrationHandler handler =
        new CustomerRegistrationHandler(registration);
    
    final String fredBody = toJson(
        "{ 'name' : 'fred', 'email' : 'fred@bedrock.com' }"
    );
    final RegistrationData fredData =
        new RegistrationData("fred", "fred@bedrock.com");
    
    @Test
    public void returns_Created_with_body_on_success()
        throws DuplicateException, ExcludedException {
        when(registration.register(fredData))
            .thenReturn(
                new Customer("0", fredData.name, fredData.email)
            );
        String expectedBody = toJson(
            "{'id':'0', 'name':'fred','email':'fred@bedrock.com'}"
        );
        assertEquals(
            new Response(HTTP_CREATED, expectedBody),
            handler.handle(new Request(fredBody))
        );
    }

    @Test
    public void returns_Conflict_for_duplicate()
        throws DuplicateException, ExcludedException {
        when(registration.register(fredData))
            .thenThrow(
                new DuplicateException(fredBody)
            );
        assertEquals(
            new Response(HTTP_CONFLICT),
            handler.handle(new Request(fredBody))
        );
    }
    ...

    private String toJson(String jsonIsh) {
        return jsonIsh.replace('\'', '"');
    }
}