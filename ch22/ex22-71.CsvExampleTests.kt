// 예제 22.71 [table-reader.53:src/test/java/travelator/tablereader/CsvExampleTests.kt]

@Test
fun example() {
    reader.useLines { lines ->
        val measurements: Sequence<Measurement> =
            readTableWithHeader(lines, splitOnComma)
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
        assertEquals(
            expected,
            measurements.toList()
        )
    }
}