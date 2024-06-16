// 예제 22.18 [table-reader.14:src/main/java/travelator/tablereader/table-reading.kt]

private fun parseLine(line: String): Map<String, String> {
    val values = if (line.isEmpty()) emptyList() else line.split(",")
    val keys = values.indices.map(Int::toString)
    return keys.zip(values).toMap()
}