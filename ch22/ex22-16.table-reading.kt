// 예제 22.16 [table-reader.13:src/main/java/travelator/tablereader/table-reading.kt]

private fun parseLine(line: String): Map<String, String> {
    val values = line.split(",")
    val keys = values.indices.map(Int::toString)
    return keys.zip(values).toMap()
}