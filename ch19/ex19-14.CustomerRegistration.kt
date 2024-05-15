// 예제 19.14 [errors.12:src/main/java/travelator/CustomerRegistration.kt]

@Throws(ExcludedException::class, DuplicateException::class)
override fun register(data: RegistrationData): Customer {
    when {
        exclusionList.exclude(data) -> throw ExcludedException()
        else -> return customers.addToo(data.name, data.email).orThrow()
    }
}