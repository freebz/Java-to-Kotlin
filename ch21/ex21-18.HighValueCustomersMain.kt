// 예제 21.18 [exceptions-to-values.6:src/main/java/travelator/marketing/HighValueCustomersMain.kt]

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