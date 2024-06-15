// 예제 20.3 [io-to-data.2:src/test/java/travelator/marketing/HighValueCustomersReportTests.kt]

private fun check(
    inputLines: List<String>,
    expectedLines: List<String>
) {
    val output = StringWriter()
    val reader = StringReader(inputLines.joinToString("\n"))
    generate(reader, output)
    val outputLines = output.toString().lines()
    
    assertEquals(expectedLines, outputLines)
}