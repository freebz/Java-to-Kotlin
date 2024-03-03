// 예제 9.16 [single-expressions.15:src/main/java/travelator/EmailAddress.kt]

fun parse(value: String): EmailAddress {
    return value.lastIndexOf('@').let { atIndex ->
        require(!(atIndex < 1 || atIndex == value.length - 1)) {
            "EmailAddress must be two parts separated by @"
        }
        EmailAddress(
            value.substring(0, atIndex),
            value.substring(atIndex + 1)
        )
    }
}