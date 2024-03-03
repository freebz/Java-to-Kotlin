// 예제 9.13 [single-expressions.12:src/main/java/travelator/EmailAddress.kt]

fun parse(value: String): EmailAddress {
    val atIndex = value.lastIndexOf('@')
    atIndex.let {
        require(!(atIndex < 1 || atIndex == value.length - 1)) {
            "EmailAddress must be two parts separated by @"
        }
        return EmailAddress(
            value.substring(0, atIndex),
            value.substring(atIndex + 1)
        )
    }
}