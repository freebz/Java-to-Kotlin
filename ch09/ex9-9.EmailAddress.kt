// 예제 9.9 [single-expressions.8:src/main/java/travelator/EmailAddress.kt]

private fun emailAddress(value: String, atIndex: Int): EmailAddress {
    return if ((atIndex < 1 || atIndex == value.length - 1)) {
        throw IllegalArgumentException(
            "EmailAddress must be two parts separated by @"    
        )
    } else {
        EmailAddress(
            value.substring(0, atIndex),
            value.substring(atIndex + 1)
        )
    }
}