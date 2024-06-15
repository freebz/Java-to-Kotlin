// 예제 21.4 [exceptions-to-values.0:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

private val CustomerData.outputLine: String
    get() = "$id\t$marketingName\t${spend.toMoneyString()}"