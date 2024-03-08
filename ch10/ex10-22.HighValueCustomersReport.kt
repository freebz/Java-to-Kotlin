// 예제 10.22 [extensions.17:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

private fun List<CustomerData>.summarised(): String =
    sumByDouble { it.spend }.let { total ->
        "\tTOTAL\t${total.toMoneyString()}"
    }