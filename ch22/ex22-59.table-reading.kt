// 예제 22.59 [table-reader.44:src/main/java/travelator/tablereader/table-reading.kt]

fun readTableWithHeader(
    lines: List<String>,
    splitter: (String) -> List<String> = splitOnComma
): List<Map<String, String> {
    val linesAsSequence = lines.asSequence()
    return when {
        linesAsSequence.isEmpty() -> emptySequence()
        else -> {
            readTable(
                linesAsSequence.drop(1),
                headerProviderFrom(linesAsSequence.first(), splitter),
                splitter
            )
        }
    }.toList()
}