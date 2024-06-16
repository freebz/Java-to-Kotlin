// 예제 22.45 [table-reader.32:src/main/java/travelator/tablereader/table-reading.kt]

fun readTable(
    lines: List<String>,
    headerProvider: (Int) -> String = Int::toString,
    splitter: (String) -> List<String> = splitOnComma
): List<Map<String, String> =
    lines.map {
        parseLine(it, headerProvider, splitter)
    }

val splitOnComma: (String) -> List<String> = { line ->
    line.splitFields(",")
}