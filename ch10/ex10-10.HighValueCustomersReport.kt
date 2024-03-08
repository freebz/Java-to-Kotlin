// 예제 10.10 [extensions.6:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

private fun lineFor(customer: CustomerData): String {
    return customer.id + "\t" + customer.marketingNameFor() + "\t" +
            formatMoney(customer.spend)
}
...
private fun CustomerData.marketingNameFor(): String {
    return familyName.toUpperCase() + ", " + givenName
}