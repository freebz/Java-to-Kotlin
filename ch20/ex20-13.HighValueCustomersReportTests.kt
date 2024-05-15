// 예제 20.13 [io-to-data.9:src/test/java/travelator/marketing/HighValueCustomersReportTests.kt]

private fun check(
    inputLines: List<String>,
    expectedLines: List<String>
) {
    val output = StringWriter()
    output.append(generate(inputLines).joinToString("\n"))
    val outputLines = output.toString().lines()
    assertEquals(expectedLines, outputLines)
}