// 예제 20.21 [io-to-data.13:src/test/java/travelator/marketing/HighValueCustomersReportTests.kt]

private fun check(
    inputLines: List<String>,
    expectedLines: List<String>
) {
    assertEquals(
        expectedLines,
        generate(inputLines).toList()
    )
}