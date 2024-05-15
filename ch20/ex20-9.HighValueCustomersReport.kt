// 예제 20.9 [io-to-data.6:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

val resultLines = listOf("ID\tName\tSpend") +
    valuableCustomers.map(CustomerData::outputLine) +
    valuableCustomers.summarised()