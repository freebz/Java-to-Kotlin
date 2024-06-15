// 예제 21.9 [exceptions-to-values.3:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

internal fun String.toCustomerData(): CustomerData? =
    split("\t").let { parts ->
        if (parts.size < 4)
            return null
        val score = parts[3].toIntOrNull() ?:
            return null
        val spend = if (parts.size == 4) 0.0 else parts[4].toDoubleOrNull() ?:
            return null
        CustomerData(
            id = parts[0],
            givenName = parts[1],
            familyName = parts[2],
            score = score,
            spend = spend
        )
    }