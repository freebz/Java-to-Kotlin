// 예제 22.8 [table-reader.6:src/test/java/travelator/tablereader/TableReaderTests.kt]

class TableReaderTests {
    @Test
    fun `empty list returns empty list`() {
        val input: List<String> = emptyList()
        val expectedResult: List<Map<String, String>> = emptyList()
        assertEquals(
            expectedResult,
            readTable(input)
        )
    }
}