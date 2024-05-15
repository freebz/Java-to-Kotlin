// 예제 20.14 [io-to-data.10:src/test/java/travelator/marketing/HighValueCustomersReportTests.kt]

private fun check(
    inputLines: List<String>,
    expectedLines: List<String>
) {
    assertEquals(expectedLines, generate(inputLines))
}