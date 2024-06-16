// 예제 22.64 [table-reader.48:src/test/java/travelator/tablereader/TableReaderTests.kt]

@Test
fun `read from reader`() {
    val fileContents = """
        H0,H1
        row0field0,row0field1
        row1field0,row1field1
    """.trimIndent()
    StringReader(fileContents).useLines { lines ->
        val result = readTableWithHeader(lines).toList()
        assertEquals(
            listOf(
                mapOf("H0" to "row0field0", "H1" to "row0field1"),
                mapOf("H0" to "row1field0", "H1" to "row1field1")
            ),
            result
        )
    }
}