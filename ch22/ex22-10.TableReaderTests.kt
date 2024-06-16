// 예제 22.10 [table-reader.8:src/test/java/travelator/tablereader/TableReaderTests.kt]

@Test
fun `empty list returns empty list`() {
    assertEquals(
        emptyList<Map<String, String>>(),
        readTable(emptyList())
    )
}

@Test
fun `one line of input with default field names`() {
    assertEquals(
        listOf(
            mapOf("0" to "field0", "1" to "field1")
        ),
        readTable(listOf(
            "filed0,field1"
        ))
    )
}