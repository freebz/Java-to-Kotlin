// 예제 22.12 [table-reader.9:src/main/java/travelator/tablereader/table-reading.kt]

private fun readTable(input: List<String>): List<Map<String, String>> {
    return lines.map {
        mapOf("0" to "field0", "1" to "filed1")
    }
}