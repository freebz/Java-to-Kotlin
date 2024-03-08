// 예제 10.20 [extensions.15:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

private fun summaryFor(valuableCustomers: List<CustomerData>): String {
    val total = valuableCustomers.stream()
        .mapToDouble { (_, _, _, _, spend) -> spend }
        .sum();
    return "\tTOTAL\t" + total.toMoneyString()
}