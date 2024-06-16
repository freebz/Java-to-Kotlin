// 예제 22.70 [table-reader.52:src/test/java/travelator/tablereader/TableReaderTests.kt]

class TableReaderTests {
    @Test
    fun `empty input returns empty`() {
        checkReadTable(
            lines = emptyList(),
            shouldReturn = emptyList()
        )
    }

    @Test
    fun `one line of input with default field names`() {
        checkReadTable(
            lines = listOf("field0,field1"),
            shouldReturn = listOf(
                mapOf("0" to "field0", "1" to "field1")
            )
        )
    }
    ...

    @Test
    fun `can specify header names when there is no header row`() {
        val headers = listOf("apple", "banana")
        checkReadTable(
            lines = listOf("field0,field1"),
            withHeaderProvider = headers::get,
            shouldReturn = listOf(
                mapOf(
                    "apple" to "field0",
                    "banana" to "field1",
                )
            )
        )
    }
    @Test
    fun `readTableWithHeader takes headers from header line`() {
        checkReadTable(
            lines = listOf(
                "H0,H1",
                "field0,field1"
            ),
            shouldReturn = listOf(
                mapOf("H0" to "field0", "H1" to "field1")
            )
        )
    }
    ...
}

private fun checkReadTable(
    lines: List<String>,
    withHeaderProvider: (Int) -> String = Int::toString,
    shouldReturn: List<Map<String, String>>,
) {
    assertEquals(
        shouldReturn,
        readTable(
            lines.asSequence().constrainOnce(),
            headerProvider = withHeaderProvider,
            splitter = splitOnComma
        ).toList()
    )
}

private fun checkReadTableWithHeader(
    lines: List<String>,
    withSplitter: (String) -> List<String> = splitOnComma,
    shouldReturn: List<Map<String, String>>,
) {
    assertEquals(
        shouldReturn,
        readTableWithHeader(
            lines.asSequence().constrainOnce(),
            splitter = withSplitter
        ).toList()
    )
}