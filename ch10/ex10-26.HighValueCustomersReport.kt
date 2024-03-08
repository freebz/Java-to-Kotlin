// 예제 10.26 [extensions.21:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

@Throws(IOException::class)
fun generate(reader: Reader, writer: Writer) {
    val valuableCustomers = withoutHeader(reader.readLines())
        .map(String::toCustomerData)
        .filter { it.score >= 10 }
        .sortedBy(CustomerData::score)
    writer.append("ID\tName\tSpend\n")
    for (customerData in valuableCustomers) {
        writer.appendLine(lineFor(customerData))
    }
    writer.append(valuableCustomers.summarised())
}

private fun withoutHeader(list: List<String>) = list.drop(1)