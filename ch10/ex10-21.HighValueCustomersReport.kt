// 예제 10.21 [extensions.16:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

private fun summaryFor(valuableCustomers: List<CustomerData>): String {
    val total = valuableCustomers.sumByDouble { it.spend }
    return "\tTOTAL\t${total.toMoneyString()}"
}