// 예제 9.21 [single-expressions.20:src/main/java/travelator/EmailAddress.kt]

fun parse(value: String): EmailAddress {
    val (leftPart, rightPart) = value.split('@')
    return EmailAddress(
        leftPart,
        rightPart
    )
}

private fun String.split(divider: Char): Pair<String, String> {
    val atIndex = lastIndexOf(divider)
    require(!(atIndex < 1 || atIndex == value.length - 1)) {
        "EmailAddress must be two parts separated by @"
    }
    val leftPart = substring(0, atIndex)
    val rightPart = substring(atIndex + 1)
    return Pair(leftPart, rightPart)
}