// 예제 22.44 [table-reader.31:src/main/java/travelator/tablereader/table-reading.kt]

fun readTable(
    lines: List<String>,
    headerProvider: (Int) -> String = Int::toString
): List<Map<String, String> =
    lines.map {
        parseLine(it, headerProvider, splitOnComma)
    }

val splitOnComma: (String) -> List<String> = { line ->
    line.splitFields(",")
}