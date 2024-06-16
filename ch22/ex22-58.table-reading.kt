// 예제 22.58 [table-reader.43:src/main/java/travelator/tablereader/table-reading.kt]

fun readTableWithHeader(
    lines: List<String>,
    splitter: (String) -> List<String> = splitOnComma
): List<Map<String, String> =
    when {
        lines.isEmpty() -> emptyList()
        else -> readTable(
            lines.drop(1).asSequence(),
            headerProviderFrom(lines.first(), splitter),
            splitter
        ).toList()
    }