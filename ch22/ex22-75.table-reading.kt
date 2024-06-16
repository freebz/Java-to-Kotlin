// 예제 22.75 [table-reader.54:src/main/java/travelator/tablereader/table-reading.kt]

fun ((String) -> List<String>).readTableWithHeader(
    reader: StringReader
): Sequence<Map<String, String>> =
    readTableWithHeader(reader.buffered().lineSequence(), this)