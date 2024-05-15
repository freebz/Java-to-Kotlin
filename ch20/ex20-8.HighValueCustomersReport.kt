// 예제 20.8 [io-to-data.5:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

writer.appendLine("ID\tName\tSpend")
for (customerData in valuableCustomers) {
    writer.appendLine(customerData.outputLine)
}
writer.append(valuableCustomers.summarised())