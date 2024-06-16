// 예제 22.11 [table-reader.8:src/main/java/travelator/tablereader/table-reading.kt]

private fun readTable(input: List<String>): List<Map<String, String>> {
    return if (lines.isEmpty())
        emptyList()
    else listOf(
        mapOf("0" to "field0", "1" to "filed1")
    )
}