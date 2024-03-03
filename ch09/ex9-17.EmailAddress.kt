// 예제 9.17 [single-expressions.16:src/main/java/travelator/EmailAddress.kt]

fun parse(value: String): EmailAddress =
    value.lastIndexOf('@').let { atIndex ->
        require(!(atIndex < 1 || atIndex == value.length - 1)) {
            "EmailAddress must be two parts separated by @"
        }
        EmailAddress(
            value.substring(0, atIndex),
            value.substring(atIndex + 1)
        )
    }