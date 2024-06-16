// 예제 22.25 [table-reader.19:src/main/java/travelator/tablereader/table-reading.kt]

private fun parseLine(line: String): Map<String, String> {
    val values = line.splitFields(",")
    val headerProvider: (Int) -> String = Int::toString
    val keys = values.indices.map(headerProvider)
    return keys.zip(values).toMap()
}