// 예제 22.38 [table-reader.27:src/test/java/travelator/tablereader/TableReaderTests.kt]

@Test
fun `can specify header names when there is no header row`() {
    val headers = listOf("apple", "banana")
    assertEquals(
        listOf(
            mapOf(
                "apple" to "field0",
                "banana" to "filed1",
            )
        ),
        readTableWithHeader(
            listOf("field0,field1"),
            headers::get
        )
    )
}