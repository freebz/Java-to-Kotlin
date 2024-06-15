// 예제 21.11 [exceptions-to-values.4:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

fun Sequence<String>.toHighValueCustomerReport(
    onErrorLine: (String) -> Unit = {}
): Sequence<String> {
    val valuableCustomers = this
        .withoutHeader()
        .map { line ->
            val customerData = line.toCustomerData()
            if (customerData == null)
                onErrorLine(line)
            customerData
        }
        .filterNotNull()
        .filter { it.score >= 10 }
        .sortedBy(CustomerData::score)
        .toList()
    return sequenceOf("ID\tName\tSpend") +
        valuableCustomers.map(CustomerData::outputLine) +
        valuableCustomers.summarised()
}