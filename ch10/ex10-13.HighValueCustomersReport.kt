// 예제 10.13 [extensions.9:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

private fun Double.toMoneyString() = this.formattedAs("%#.2f")

private fun Double.formattedAs(format: String) = String.format(format, this)