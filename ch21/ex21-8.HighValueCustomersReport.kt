// 예제 21.8 [exceptions-to-values.2:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

fun Sequence<String>.toHighValueCustomerReport(): Sequence<String> {
    val valuableCustomers = lines
        .withoutHeader()
        .map(String::toCustomerData)
        .filterNotNull()
        .filter { it.score >= 10 }
        .sortedBy(CustomerData::score)
        .toList()
    return sequenceOf("ID\tName\tSpend") +
        valuableCustomers.map(CustomerData::outputLine) +
        valuableCustomers.summarised()
}