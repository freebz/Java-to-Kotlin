// 예제 22.20 [table-reader.16:src/main/java/travelator/tablereader/table-reading.kt]

private fun parseLine(line: String): Map<String, String> {
    val values = line.splitFields(",")
    val keys = values.indices.map(Int::toString)
    return keys.zip(values).toMap()
}

private fun String.splitFields(separators: String): List<String> =
    if (isEmpty()) emptyList() else line.split(separators)