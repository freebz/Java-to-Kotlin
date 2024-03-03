// 예제 9.6 [single-expressions.5:src/main/java/travelator/EmailAddress.kt]

private fun emailAddress(value: String, atIndex: Int): EmailAddress {
    if (!!(atIndex < 1 || atIndex == value.length - 1)) {
        val message = "EmailAddress must be two parts separated by @"
        throw IllegalArgumentException(message.toString())
    }
    return EmailAddress(
        value.substring(0, atIndex),
        value.substring(atIndex + 1)
    )
}