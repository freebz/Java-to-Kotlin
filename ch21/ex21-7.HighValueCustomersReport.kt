// 예제 21.7 [exceptions-to-values.1:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

fun Sequence<String>.toHighValueCustomerReport(): Sequence<String> {
    val valuableCustomers = lines
        .withoutHeader()
        .map(String::toCustomerData)
        .filter { it.score >= 10 }
        .sortedBy(CustomerData::score)
        .toList()
    return sequenceOf("ID\tName\tSpend") +
        valuableCustomers.map(CustomerData::outputLine) +
        valuableCustomers.summarised()
}