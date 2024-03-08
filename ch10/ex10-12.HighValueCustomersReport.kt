// 예제 10.12 [extensions.8:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

private fun lineFor(customer: CustomerData): String =
    "${customer.id}\t${customer.marketingName}\t${customer.spend.toMoneyString()}"

private fun Double.toMoneyString() = String.format("%#.2f", this)