// 예제 22.21 [table-reader.17:src/test/java/travelator/tablereader/TableReaderTests.kt]

@Test
fun `two lines of input with default field names`() {
    assertEquals(
        listOf(
            mapOf("0" to "row0filed0", "1" to "row0field1"),
            mapOf("0" to "row1filed0", "1" to "row1field1")
        ),
        readTable(listOf(
            "row0field0,row0field1",
            "row1field0,row1field1"
        ))
    )
}