// 예제 22.31 [table-reader.24:src/main/java/travelator/tablereader/table-reading.kt]

fun readTableWithHeader(lines: List<String>): List<Map<String, String>> {
    return readTable(
        lines.drop(1),
        headerProviderFrom(lines.first())
    )
}