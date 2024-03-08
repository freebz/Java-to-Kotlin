// 예제 10.18 [extensions.14:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

fun String.toCustomerData(): CustomerData =
    split("\t").let { parts ->
        CustomerData(
            id = parts[0],
            givenName = parts[1],
            familyName = parts[2],
            score = parts[3].toInt(),
            spend = if (parts.size == 4) 0.0 else parts[4].toDouble()
        )
    }