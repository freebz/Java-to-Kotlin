// 예제 9.8 [single-expressions.7:src/main/java/travelator/EmailAddress.kt]

private fun emailAddress(value: String, atIndex: Int): EmailAddress {
    if ((atIndex < 1 || atIndex == value.length - 1)) {
        throw IllegalArgumentException(
            "EmailAddress must be two parts separated by @"    
        )
    } else {
        return EmailAddress(
            value.substring(0, atIndex),
            value.substring(atIndex + 1)
        )
    }
}