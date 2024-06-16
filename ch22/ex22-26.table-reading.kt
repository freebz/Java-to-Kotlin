// 예제 22.26 [table-reader.20:src/main/java/travelator/tablereader/table-reading.kt]

private fun parseLine(
    line: String,
    headerProvider: (Int) -> String
): Map<String, String> {
    val values = line.splitFields(",")
    val keys = values.indices.map(headerProvider)
    return keys.zip(values).toMap()
}