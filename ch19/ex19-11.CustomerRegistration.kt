// 예제 19.11 [errors.9:src/main/java/travelator/CustomerRegistration.kt]

@Throws(ExcludedException::class, DuplicateException::class)
override fun register(data: RegistrationData): Customer {
    return if (exclusionList.exclude(data)) {
        throw ExcludedException()
    } else {
        val result: Result<Customer, DuplicateException> =
            customers.add(data.name, data.email)
        when (result) {
            is Success<Customer> ->
                result.value
            is Failure<DuplicateException> ->
                throw result.reason
        }
    }
}