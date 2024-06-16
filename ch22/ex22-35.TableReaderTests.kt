// 예제 22.35 [table-reader.26:src/test/java/travelator/tablereader/TableReaderTests.kt]

@Test
fun `readTableWithHeader on empty list returns empty list`() {
    assertEquals(
        emptyList(),
        readTableWithHeader(
            emptyList()
        )
    )
}