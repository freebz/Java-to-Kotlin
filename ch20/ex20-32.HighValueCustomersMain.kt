// 예제 20.32 [io-to-data.20:src/main/java/travelator/marketing/HighValueCustomersMain.kt]

fun main() {
    System.`in`.reader().use { reader ->
        System.out.writer().use { writer ->
            writer.appendLines(
                generate(
                    reader.buffered().constrainOnce()
                )
            )
        }
    }
}