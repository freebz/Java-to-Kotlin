// 예제 10.1 [extensions.0:src/test/java/travelator/marketing/HighValueCustomersReportTests.java]

public class HighValueCustomersReportTests {

    @Test
    public void test() throws IOException {
        List<String> input = List.of(
            "ID\tFirstName\tLastName\tScore\tSpend",
            "1\tFred\tFlintstone\t11\t1000.00",
            "4\tBetty\tRubble\t10\t2000.00",
            "2\tBarney\tRubble\t0\t20.00",
            "3\tWilma\tFlinstone\t9\t0.00"
        );
        List<String> expected = List.of(
            "ID\tName\tSpend",
            "4\tRUBBLE, Betty\t2000.00",
            "1\tFLINTSTONE, Fred\t1000.00",
            "\tTOTAL\t3000.00"
        );
        check(input, expected);
    }

    @Test
    public void emptyTest() throws IOException {
        List<String> input = List.of(
            "ID\tFirstName\tLastName\tScore\tSpend"
        );
        List<String> expected = List.of(
            "ID\tName\tSpend",
            "\tTOTAL\t0.00"
        );
        check(input, expected);
    }

    @Test
    public void emptySpendIs0() {
        assertEquals(
            new CustomerData("1", "Fred", "Flintstone", 0, 0D),
            HighValueCustomerReport.customerDataFrom("1\tFred\tFlintstone\t0")
        );
    }

    private void check(
        List<String> inputLines,
        List<String> expectedLines
    ) throws IOException {
        var output = new StringWriter();
        HighValueCustomersReport.generate(
            new StringReader(String.join("\n", inputLines)),
            output
        );
        assertEquals(String.join("\n", expectedLines), output.toString());
    }
}