// 예제 22.27 [table-reader.20:src/main/java/travelator/tablereader/table-reading.kt]

fun readTableWithHeader(lines: List<String>): List<Map<String, String>> {
    return readTable(lines)
}

fun readTable(lines: List<String>): List<Map<String, String>> {
    return lines.map(::parseLine)
}