// 예제 22.73 [table-reader.53:src/test/java/travelator/tablereader/CsvExampleTests.kt]

.map { record ->
    Measurement(
        t = record["time"]?.toDoubleOrNull()
            ?: error("in time"),
        x = record["x"]?.toDoubleOrNull()
            ?: error("in x"),
        y = record["y"]?.toDoubleOrNull()
            ?: error("in y"),
    )
}