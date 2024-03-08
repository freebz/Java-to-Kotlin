// 예제 10.25 [extensions.20:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

@Throws(IOException::class)
fun generate(reader: Reader, writer: Writer) {
    val valuableCustomers = reader.readLines()
        .drop(1) // header
        .map(String::toCustomerData)
        .filter { it.score >= 10 }
        .sortedBy(CustomerData::score)
    writer.append("ID\tName\tSpend\n")
    for (customerData in valuableCustomers) {
        writer.appendLine(lineFor(customerData))
    }
    writer.append(valuableCustomers.summarised())
}