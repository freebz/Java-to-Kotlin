// 예제 10.16 [extensions.12:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

fun customerDataFrom(line: String): CustomerData {
    val parts = line.split("\t")
    return CustomerData(
        id = parts[0],
        givenName = parts[1],
        familyName = parts[2],
        score = parts[3].toInt(),
        spend = if (parts.size == 4) 0.0 else parts[4].toDouble()
    )
}