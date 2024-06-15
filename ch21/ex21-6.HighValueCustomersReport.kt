// 예제 21.6 [exceptions-to-values.1:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

internal fun String.toCustomerData(): CustomerData? =
    split("\t").let { parts ->
        if (parts.size < 4)
            null
        else
            CustomerData(
                id = parts[0],
                givenName = parts[1],
                familyName = parts[2],
                score = parts[3].toInt(),
                spend = if (parts.size == 4) 0.0 else parts[4].toDouble()
            )
    }