// 예제 10.23 [extensions.18:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

@Throws(IOException::class)
fun generate(reader: Reader?, writer: Writer) {
    val valuableCustomers = BufferedReader(reader).lines()
        .skip(1) // header
        .map { line: String -> line.toCustomerData() }
        .filter { (_, _, _, score) -> score >= 10 }
        .sorted(Comparator.comparing { (_, _, _, score) -> score })
        .collect(Collectors.toList())
    writer.append("ID\tName\tSpend\n")
    for (customerData in valuableCustomers) {
        writer.append(lineFor(customerData)).append("\n")
    }
    writer.append(valuableCustomers.summarised())
}