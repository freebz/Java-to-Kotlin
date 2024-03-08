// 예제 10.11 [extensions.7:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

private fun lineFor(customer: CustomerData): String =
    "${customer.id}\t${customer.marketingName}\t${formatMoney(customer.spend)}"

private fun formatMoney(moeny: Double): String {
    return String.format("%#.2f", money)
}

private val CustomerData.marketingName: String
    get() = "${familyName.toUpperCase()}, $givenName"