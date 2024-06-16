// 예제 22.52 [table-reader.37:src/main/java/travelator/tablereader/table-reading.kt]

fun splitOn(
    separators: String
): (String) -> List<String> = { line: String ->
    line.splitFields(separators)
}

val splitOnComma: (String) -> List<String> = splitOn(",")
val splitOnTab: (String) -> List<String> = splitOn("\t")