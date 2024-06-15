// 예제 21.10 [exceptions-to-values.4:src/test/java/travelator/marketing/HighValueCustomersReportTests.kt]

@Test
fun `calls back on parsing error`() {
    val lines = listOf(
        "ID\tFirstName\tLastName\tScore\tSpend",
        "INVALID LINE",
        "1\tFred\tFlintstone\t11\t1000.00",
    )

    val errorCollector = mutableListOf<String>()
    val result = lines
        .asSequence()
        .constrainOnce()
        .toHighValueCustomerReport { badLine ->
            errorCollector += badLine
        }
        .toList()

    assertEquals(
        listOf(
            "ID\tName\tSpend",
            "1\tFLINTSTONE, Fred\t1000.00",
            "\tTOTAL\t1000.00"
        ),
        result
    )
    assertEquals(
        listOf("INVALID LINE"),
        errorCollector
    )
}