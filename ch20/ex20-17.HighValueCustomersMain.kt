// 예제 20.17 [io-to-data.0:src/main/java/travelator/marketing/HighValueCustomersMain.kt]

fun main() {
    InputStreamReader(System.`in`).use { reader ->
        OutputStreamWriter(System.out).use { writer ->
            generate(reader, writer)
        }
    }
}