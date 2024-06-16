// 예제 22.23 [table-reader.18:src/main/java/travelator/tablereader/table-reading.kt]

fun readTableWithHeader(lines: List<String>): List<Map<String, String>> {
    return readTable(lines)
}

fun readTable(lines: List<String>): List<Map<String, String>> {
    return lines.map(::parseLine)
}