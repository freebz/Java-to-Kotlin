// 예제 22.33 [table-reader.25:src/main/java/travelator/tablereader/table-reading.kt]

fun headerProviderFrom(header: String): (Int) -> String {
    val headers = header.splitFields(",")
    return { index -> headers[index] }
}