// 예제 21.22 [exceptions-to-values.6:src/main/java/travelator/marketing/HighValueCustomersMain.kt]

fun main() {
    System.`in`.reader().use { reader ->
        System.out.writer().use { writer ->
            val errorLines = mutableListOf<ParseFailure>()
            val reportLines = reader
                .asLineSequence()
                .toHighValueCustomerReport {
                    errorLines += it
                }
            if (errorLines.isNotEmpty()) {
                System.err.writer().use { error ->
                    error.appendLine("Lines with errors")
                    errorLines.asSequence().map { parseFailure ->
                        "${parseFailure::class.simpleName} in ${parseFailure.line}"
                    }.writeTo(error)
                }
                exitProcess(-1)
            } else {
                reportLines.writeTo(writer)
            }
        }
    }
}