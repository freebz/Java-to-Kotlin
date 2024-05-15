// 예제 20.18 [io-to-data.9:src/main/java/travelator/marketing/HighValueCustomersMain.kt]

fun main() {
    System.`in`.reader().use { reader ->
        System.out.writer().use { writer ->
            writer.append(
                generate(
                    reader.readLines()
                ).joinToString("\n")
            )
        }
    }
}