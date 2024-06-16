// 예제 22.74 [table-reader.54:src/test/java/travelator/tablereader/CsvExampleTests.kt]

@Test
fun `configuration example`() {
    reader.use { reader ->
        val measurements = splitOnComma.readTableWithHeader(reader)
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