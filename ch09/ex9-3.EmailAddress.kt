// 예제 9.3 [single-expressions.2:src/main/java/travelator/EmailAddress.kt]

fun parse(value: String): EmailAddress {
    require(!(
            value.lastIndexOf('@') < 1 ||
                    value.lastIndexOf('@') == value.length - 1)) {
        "EmailAddress must be two parts separated by @"
    }
    return EmailAddress(
        value.substring(0, value.lastIndexOf('@')),
        value.substring(value.lastIndexOf('@') + 1)
    )
}