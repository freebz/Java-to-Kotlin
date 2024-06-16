// 예제 22.7 [table-reader.5:src/test/java/travelator/tablereader/TableReaderAcceptanceTests.kt]

@Disabled
@Test
fun `acceptance test`() {
    val input = listOf(
        "time,x,y",
        "0.0, 1, 1",
        "0.1,1.1,1.2",
        "0.2,1.2,1.4",
    )
    val expected = listOf(
        Measurement(0.0, 1.0, 1.0),
        Measurement(0.1, 1.1, 1.2),
        Measurement(0.2, 1.2, 1.4)
    )
    assertEquals(
        expected,
        readTable(input).map { record ->
            Measurement(
                record["time"]?.toDoubleOrNull() ?: error("in time"),
                record["x"]?.toDoubleOrNull() ?: error("in x"),
                record["y"]?.toDoubleOrNull() ?: error("in y"),
            )
        }
    )
}