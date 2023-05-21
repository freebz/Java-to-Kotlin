// 예제 3.5 [classes.0:src/test/java/travelator/EmailAddressTests.java]

public class EmailAddressTests {
    
    @Test
    public void parsing() {
        assertEquals(
                new EmailAddress("fred", "example.com"),
                EmailAddress.parse("fred@example.com")
        );
    }

    @Test
    public void parsingFailures() {
        assertThrows(
                IllegalArgumentException.class,
                () -> EmailAddress.parse("@")
        );
        ...
    }
    ...
}