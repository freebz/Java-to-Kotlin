// 예제 19.29 [errors.21:src/test/java/travelator/handlers/CustomerRegistrationHandlerTests.java]

public void returns_Created_with_body_on_success() {

    when(registration.registerToo(fredData))
        .thenReturn(new Success<>(
            new Customer("0", fredData.name, fredData.email)
        ));

    String expectedBody = toJson(
        "{'id':'0', 'name':'fred','email':'fred@bedrock.com'}"
    );
    assertEquals(
        new Response(HTTP_CREATED, expectedBody),
        handler.handle(new Request(fredBody))
    );
}

@Test
public void returns_Conflict_for_duplicate() {
    when(registration.register(fredData))
        .thenReturn(new Failure<>(
            new DuplicateException(fredBody)
        ));
    
    assertEquals(
        new Response(HTTP_CONFLICT),
        handler.handle(new Request(fredBody))
    );
}