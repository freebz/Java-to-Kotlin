// 예제 20.30 [io-to-data.19:src/test/java/travelator/marketing/HighValueCustomersReportTests.kt]

private fun check(
    inputLines: List<String>,
    expectedLines: List<String>
) {
    assertEquals(
        expectedLines,
        generate(
            inputLines.asSequence().constrainOnce()
        ).toList()
    )
}