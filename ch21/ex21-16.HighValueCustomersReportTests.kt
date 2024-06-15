// 예제 21.16 [exceptions-to-values.6:src/test/java/travelator/marketing/HighValueCustomersReportTests.kt]

val errorCollector = mutableListOf<ParseFailure>()
val result = lines
    .asSequence()
    .constrainOnce()
    .toHighValueCustomerReport { badLine ->
        errorCollector += badLine
    }
    .toList()
assertEquals(
    listOf(NotEnoughFieldsFailure("INVALID LINE")),
    errorCollector
)