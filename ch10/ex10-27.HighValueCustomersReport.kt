// 예제 10.27 [extensions.22:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

@Throws(IOException::class)
fun generate(reader: Reader, writer: Writer) {
    val valuableCustomers = reader.readLines()
        .withoutHeader()
        .map(String::toCustomerData)
        .filter { it.score >= 10 }
        .sortedBy(CustomerData::score)
    writer.append("ID\tName\tSpend\n")
    for (customerData in valuableCustomers) {
        writer.appendLine(lineFor(customerData))
    }
    writer.append(valuableCustomers.summarised())
}

private fun List<String>.withoutHeader() = drop(1)