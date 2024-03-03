// 예제 9.22 [single-expressions.21:src/main/java/travelator/EmailAddress.kt]

fun parse(value: String): EmailAddress =
    value.split('@').let { (leftPart, rightPart) ->
        EmailAddress(leftPart, rightPart)
    }