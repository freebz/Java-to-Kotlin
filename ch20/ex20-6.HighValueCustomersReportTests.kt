// 예제 20.6 [io-to-data.4:src/test/java/travelator/marketing/HighValueCustomersReportTests.kt]

private fun check(
    inputLines: List<String>,
    expectedLines: List<String>
) {
    val output = StringWriter()
    val reader = StringReader(inputLines.joinToString("\n"))
    generate(output, reader.readLines())
    val outputLines = output.toString().lines()
    assertEquals(expectedLines, outputLines)
}