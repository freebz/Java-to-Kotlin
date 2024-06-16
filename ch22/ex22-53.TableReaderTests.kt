// 예제 22.53 [table-reader.38:src/test/java/travelator/tablereader/TableReaderTests.kt]

@Test
fun `can specify splitter`() {
    assertEquals(
        listOf(
            mapOf(
                "header1" to "field0",
                "header2" to "filed1",
            )
        ),
        readTableWithHeader(
            listOf(
                "header1\theader2"
                "field0\tfield1"
            ),
            splitOnTab
        )
    )
}