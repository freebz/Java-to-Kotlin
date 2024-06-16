// 예제 22.72 [table-reader.53:src/test/java/travelator/tablereader/CsvExampleTests.kt]

@Test
fun `commons csv`() {
    reader.use { reader ->
        val parser = CSVParser.parse(
            reader,
            CSVFormat.DEFAULT.withFirstRecordAsHeader()
        )
        val measurements: Sequence<Measurement> = parser
            .asSequence()
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