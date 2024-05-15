// 예제 20.33 [io-to-data.21:src/main/java/travelator/marketing/HighValueCustomersMain.kt]

fun main() {
    System.`in`.reader().use { reader ->
        System.out.writer().use { writer ->
            reader
                .asLineSequence()
                .toHighValueCustomerReport()
                .writeTo(writer)
        }
    }
}