// 예제 22.48 [table-reader.34:src/main/java/travelator/tablereader/table-reading.kt]

fun readTableWithHeader(
    lines: List<String>
): List<Map<String, String>> =
    when {
        lines.isEmpty() -> emptyList()
        else -> readTable(
            lines.drop(1),
            headerProviderFrom(lines.first(), splitOnComma)
        )
    }
...

val splitOnComma: (String) -> List<String> = { line ->
    line.splitFields(",")
}