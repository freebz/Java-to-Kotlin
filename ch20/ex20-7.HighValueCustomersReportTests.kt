// 예제 20.7 [io-to-data.5:src/test/java/travelator/marketing/HighValueCustomersReportTests.kt]

private fun check(
    inputLines: List<String>,
    expectedLines: List<String>
) {
    val output = StringWriter()
    generate(output, inputLines)
    val outputLines = output.toString().lines()
    assertEquals(expectedLines, outputLines)
}