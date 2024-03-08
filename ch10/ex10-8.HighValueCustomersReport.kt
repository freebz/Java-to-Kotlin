// 예제 10.8 [extensions.4:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

object HighValueCustomersReport {
    ...
    @JvmStatic
    fun customerDataFrom(line: String): CustomerData {
        val parts = line.split("\t".toRegex()).toTypedArray()
        val spend: Double = if (parts.size == 4) 0.0 else parts[4].toDouble()
        return CustomerData(
            parts[0],
            parts[1],
            parts[2],
            parts[3].toInt(),
            spend
        )
    }
    ...
}