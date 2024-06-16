// 예제 22.3 [table-reader.3:src/test/java/travelator/tablereader/TableReaderAcceptanceTests.kt]

private fun someFunction(input: List<String>): List<Measurement> =
    readTable(input)
        .map { record ->
            Measurement(
                record["time"].toDouble(),
                record["x"].toDouble(),
                record["y"].toDouble(),
            )
        }