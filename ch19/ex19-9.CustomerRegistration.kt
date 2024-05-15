// 예제 19.9 [errors.7:src/main/java/travelator/CustomerRegistration.kt]

@Throws(ExcludedException::class, DuplicateException::class)
override fun register(data: RegistrationData): Customer {
    return if (exclusionList.exclude(data)) {
        throw ExcludedException()
    } else {
        val result = customers.add(data.name, data.email)
        result
    }
}