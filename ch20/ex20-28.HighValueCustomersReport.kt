// 예제 20.28 [io-to-data.18:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

val valuableCustomers: Sequence<CustomerData> = lines
    .asSequence()
    .constrainOnce()
    .withoutHeader()
    .map(String::toCustomerData)
    .filter { it.score >= 10 }
    .sortedBy(CustomerData::score)
    .toList()