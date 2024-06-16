// 예제 22.22 [table-reader.18:src/test/java/travelator/tablereader/TableReaderTests.kt]

@Test
fun `takes headers from header line`() {
    assertEquals(
        listOf(
            mapOf("H0" to "filed0", "H1" to "field1")
        ),
        readTableWithHeader(
            listOf(
                "H0,H1",
                "field0,field1"
            )
        )
    )
}