// 예제 10.19 [extensions.14:src/test/java/travelator/marketing/HighValueCustomersReportTests.java]

@Test
public void emptySpendIs0() {
    assertEquals(
        new CustomerData("1", "Fred", "Flintstone", 0, 0D),
        HighValueCustomerReportKt.toCustomerData("1\tFred\tFlintstone\t0")
    );
}