// 예제 22.40 [table-reader.27:src/test/java/travelator/tablereader/TableReaderAcceptanceTests.kt]

assertEquals(
    expected,
    readTableWithHeader(input).map { record ->
        Measurement(
            record["time"]?.toDoubleOrNull() ?: error("in time"),
            record["x"]?.toDoubleOrNull() ?: error("in x"),
            record["y"]?.toDoubleOrNull() ?: error("in y"),
        )
    }
)