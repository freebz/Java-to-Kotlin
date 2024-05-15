// 예제 20.23 [io-to-data.14:src/main/java/travelator/marketing/HighValueCustomersMain.kt]

fun main() {
    System.`in`.reader().use { reader ->
        System.out.writer().use { writer ->
            writer.append(
                generate(
                    reader.readLines()
                ).forEach { line ->
                    writer.appendLine(line)
                }
            )
        }
    }
}