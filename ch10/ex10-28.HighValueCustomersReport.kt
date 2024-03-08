// 예제 10.28 [extensions.23:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

@Throws(IOException::class)
fun generate(reader: Reader, writer: Writer) {
    val valuableCustomers = reader
        .readLines()
        .toValuableCustomers()
        .sortedBy(CustomerData::score)
    writer.append("ID\tName\tSpend\n")
    for (customerData in valuableCustomers) {
        writer.appendLine(customerData.outputLine)
    }
    writer.append(valuableCustomers.summarised())
}

private fun List<String>.toValuableCustomers() = withoutHeader()
    .map(String::toCustomerData)
    .filter { it.score >= 10 }
...

private val CustomerData.outputLine: String
    get() = "$id\t$marketingName\t${spend.toMoneyString()}"