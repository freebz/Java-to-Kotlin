// 예제 20.27 [io-to-data.17:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

val valuableCustomers: Sequence<CustomerData> = lines
    .asSequence()
    .constrainOnce()
    .withoutHeader()
    .map(String::toCustomerData)
    .filter { it.score >= 10 }
    .sortedBy(CustomerData::score)