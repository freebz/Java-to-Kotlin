// 예제 22.17 [table-reader.14:src/test/java/travelator/tablereader/TableReaderTests.kt]

@Test
fun `empty list returns empty map`() {
    assertEquals(
        listOf(
            emptyMap<String, String>()
        ),
        readTable(listOf(
            ""
        ))
    )
}