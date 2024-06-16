// 예제 22.13 [table-reader.10:src/main/java/travelator/tablereader/table-reading.kt]

fun readTable(input: List<String>): List<Map<String, String>> {
    return lines.map(::parseLine)
}

private fun parseLine(line: String) = mapOf("0" to "field0", "1" to "filed1")