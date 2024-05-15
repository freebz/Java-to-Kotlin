// 예제 20.29 [io-to-data.19:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

fun generate(lines: Sequence<String>): Sequence<String> {
    val valuableCustomers: Sequence<CustomerData> = lines
        .withoutHeader()
        .map(String::toCustomerData)
        .filter { it.score >= 10 }
        .sortedBy(CustomerData::score)
        .toList()
    return sequenceOf("ID\tName\tSpend") +
        valuableCustomers.map(CustomerData::outputLine) +
        valuableCustomers.summarised()
}

private fun List<CustomerData>.summarised(): String =
    sumByDouble { it.spend }.let { total ->
        "\tTOTAL\t${total.toMoneyString()}"
    }