// 예제 22.55 [table-reader.40:src/main/java/travelator/tablereader/table-reading.kt]

fun readTable(
    lines: List<String>,
    headerProvider: (Int) -> String = Int::toString,
    splitter: (String) -> List<String> = splitOnComma
): List<Map<String, String> =
    lines
        .asSequence()
        .map {
            parseLine(it, headerProvider, splitter)
        }
        .toList()