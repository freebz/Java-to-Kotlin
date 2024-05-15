// 예제 20.31 [io-to-data.19:src/main/java/travelator/marketing/HighValueCustomersMain.kt]

fun main() {
    System.`in`.reader().use { reader ->
        System.out.writer().use { writer ->
            writer.appendLines(
                generate(
                    reader.readLines().asSequence().constrainOnce()
                )
            )
        }
    }
}