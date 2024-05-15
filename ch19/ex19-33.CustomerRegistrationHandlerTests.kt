// 예제 19.33 [errors.24:src/test/java/travelator/handlers/CustomerRegistrationHandlerTests.kt]

@Test
fun `adds a customer when not excluded`() {
    assertEquals(Optional.empty(), customers.find("0"))
    val added = registration.registerToo(
        RegistrationData("fred flintstone", "fred@bedrock.com")
    ).valueOrNull()
    assertEquals(
        Customer("0", "fred flintstone", "fred@bedrock.com"),
        added
    )
    assertEquals(added, customers.find("0").orElseThrow())
}

@Test
fun `throws DuplicateException when email address exists`() {
    customers.add(Customer("0", "fred flintstone", "fred@bedrock.com"))
    assertEquals(1, customers.size())
    val failure = registration.registerToo(
        RegistrationData("another name", "fred@bedrock.com")
    ).failureOrNull()
    assertEquals(
        Duplicate("customer with email fred@bedrock.com already exists"),
        failure
    )
    assertEquals(1, customers.size());
}
    ...