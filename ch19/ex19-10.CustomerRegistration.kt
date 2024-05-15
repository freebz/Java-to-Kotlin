// 예제 19.10 [errors.8:src/main/java/travelator/CustomerRegistration.kt]

@Throws(ExcludedException::class, DuplicateException::class)
override fun register(data: RegistrationData): Customer {
    return if (exclusionList.exclude(data)) {
        throw ExcludedException()
    } else {
        val result: Result<Customer, DuplicateException> =
            customers.add(data.name, data.email)
        result
    }
}