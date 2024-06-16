// 예제 22.5 [table-reader.4:src/test/java/travelator/tablereader/TableReaderAcceptanceTests.kt]

private fun someFunction(input: List<String>): List<Measurement> =
    readTable(input).map { record ->
        Measurement(
            record["time"]?.toDoubleOrNull() ?: error("in time"),
            record["x"]?.toDoubleOrNull() ?: error("in x"),
            record["y"]?.toDoubleOrNull() ?: error("in y"),
        )
    }

private fun readTable(input: List<String>): List<Map<String, String>> {
    TODO("Not yet implemented")
}