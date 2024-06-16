// 예제 22.46 [table-reader.32:src/main/java/travelator/tablereader/table-reading.kt]

private fun headerProviderFrom(header: String): (Int) -> String {
    val headers = header.splitFields(",")
    return { index -> headers[index] }
}