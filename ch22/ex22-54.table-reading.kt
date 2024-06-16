// 예제 22.54 [table-reader.39:src/main/java/travelator/tablereader/table-reading.kt]

fun readTable(
    lines: List<String>,
    headerProvider: (Int) -> String = Int::toString,
    splitter: (String) -> List<String> = splitOnComma
): List<Map<String, String> =
    lines.map {
        parseLine(it, headerProvider, splitter)
    }