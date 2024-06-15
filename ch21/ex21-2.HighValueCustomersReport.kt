// 예제 21.2 [exceptions-to-values.0:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

private val CustomerData.marketingName: String
    get() = "${familyName.toUpperCase()}, $givenName"