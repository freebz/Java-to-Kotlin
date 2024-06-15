// 예제 21.23 [exceptions-to-values.8:src/main/java/travelator/marketing/HighValueCustomersMain.kt]

fun main() {
    val statusCode = using(
        System.`in`.reader(),
        System.out.writer(),
        System.err.writer()
    ) { reader, writer, error ->
        val errorLines = mutableListOf<ParseFailure>()
        val reportLines = reader
            .asLineSequence()
            .toHighValueCustomerReport {
                errorLines += it
            }
        if (errorLines.isEmpty()) {
            reportLines.writeTo(writer)
            0
        } else {
            errorLines.writeTo(error)
            -1
        }
    }
    exitProcess(statusCode)
}

inline fun <A : Closeable, B : Closeable, C : Closeable, R> using(
    a: A,
    b: B,
    c: C,
    block: (a, b, c) -> R
): R =
    a.use {
        b.use {
            c.use {
                block(a, b, c)
            }
        }
    }

private fun List<ParseFailure>.writeTo(error: OutputStreamWriter) {
    error.appendLine("Lines with errors")
    asSequence().map { parseFailure ->
        "${parseFailure::class.simpleName} in ${parseFailure.line}"
    }.writeTo(error)
}