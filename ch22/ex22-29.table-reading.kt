// 예제 22.29 [table-reader.22:src/main/java/travelator/tablereader/table-reading.kt]

fun readTableWithHeader(lines: List<String>): List<Map<String, String>> {
    return readTable(lines)
}

fun readTable(
    lines: List<String>,
    headerProvider: KFunction1<Int, String> = Int::toString
): List<Map<String, String>> {
    return lines.map { parseLine(it, headerProvider) }
}