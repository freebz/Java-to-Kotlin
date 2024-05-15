// 예제 19.32 [errors.23:src/test/java/travelator/handlers/CustomerRegistrationHandlerTests.java]

public class CustomerRegistrationHandlerTests {

    InMemoryCustomers customers = new InMemoryCustomers();
    Set<String> excluded = Set.of(
        "cruella@hellhall.co.uk"
    );
    CustomerRegistration registration = new CustomerRegistration(customers,
        (registration) -> excluded.contains(registrationData.email)
    );
    
    @Test
    public void adds_a_customer_when_not_excluded()
        throws DuplicateException, ExcludedException {
        assertEquals(Optional.empty(), customers.find("0"));

        Customer added = registration.register(
                new RegistrationData("fred flintstone", "fred@bedrock.com")
        );
        assertEquals(
                new Customer("0", "fred flintstone", "fred@bedrock.com"),
                added
        );
        assertEquals(added, customers.find("0").orElseThrow());
    }

    @Test
    public void throws_DuplicateException_when_email_address_exists() {
        customers.add(new Customer("0", "fred flintstone", "fred@bedrock.com"));
        assertEquals(1, customers.size());

        assertThrows(DuplicateException.class,
                () -> registration.register(
                        new RegistrationData("another name", "fred@bedrock.com")
                )
        );
        assertEquals(1, customers.size());
    }
    ...
}