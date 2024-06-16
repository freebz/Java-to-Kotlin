// 예제 22.63 [table-reader.47:src/main/java/travelator/tablereader/table-reading.kt]

private fun headerProviderFrom(
    header: String,
    splitter: (String) -> List<String>
): (Int) -> String {
    val headers = splitter(header)
    return { index -> headers[index] }
}

private fun parseLine(
    line: String,
    headerProvider: (Int) -> String,
    splitter: (String) -> List<String>,
): Map<String, String> {
    val values = splitter(line)
    val keys = values.indices.map(headerProvider)
    return keys.zip(values).toMap()
}

// 빈 문자열에 대해 String.split을 호출하면 빈 리스트가 아니라
// 빈 문자열의 리스트를 반환하기 때문에 빈 문자열을 별도로 처리할 필요가 있다.
private fun String.splitFields(separators: String): List<String> =
    if (isEmpty()) emptyList() else split(separators)