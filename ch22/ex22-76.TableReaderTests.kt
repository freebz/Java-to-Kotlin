// 예제 22.76 [table-reader.55:src/test/java/travelator/tablereader/TableReaderTests.kt]

@Test
fun `Table contains headers`() {
    val result: Table = readTableWithHeader(
        listOf(
            "H0,H1",
            "field0,field1"
        ).asSequence()
    )
    assertEquals(
        listOf("H0", "H1"),
        result.headers
    )
}

@Test
fun `Table contains empty headers for empty input`() {
    assertEquals(
        emptyList<String>(),
        readTableWithHeader(emptySequence()).headers
    )
}