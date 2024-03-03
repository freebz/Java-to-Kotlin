// 예제 9.11 [single-expressions.10:src/main/java/travelator/EmailAddress.kt]

fun parse(value: String) =
    emailAddress(value, value.lastIndexOf('@'))

private fun emailAddress(value: String, atIndex: Int): EmailAddress =
    when {
        atIndex < 1 || atIndex == value.length - 1 ->
            throw IllegalArgumentException(
                "EmailAddress must be two parts separated by @"    
            )
        else -> EmailAddress(
            value.substring(0, atIndex),
            value.substring(atIndex + 1)
        )
    }