// 예제 21.14 [exceptions-to-values.5:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

sealed class ParseFailure(open val line: String)
data class NotEnoughFieldsFailure(override val line: String) :
    ParseFailure(line)
data class ScoreIsNotAnIntFailure(override val line: String) :
    ParseFailure(line)
data class SpendIsNotADoubleFailure(override val line: String) :
    ParseFailure(line)