// 예제 22.43 [table-reader.30:src/main/java/travelator/tablereader/table-reading.kt]

fun readTable(
    lines: List<String>,
    headerProvider: (Int) -> String = Int::toString
): List<Map<String, String> =
    lines.map {
        val splitOnComma: (String) -> List<String> = { line ->
            line.splitFields(",")
        }
        parseLine(it, headerProvider, splitOnComma)
    }