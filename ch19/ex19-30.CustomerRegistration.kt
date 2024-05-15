// 예제 19.30 [errors.22:src/main/java/travelator/CustomerRegistration.kt]

class CustomerRegistration(
    private val customers: Customers,
    private val exclusionList: ExclusionList
) : IRegisterCustomers {

    @Throws(ExcludedException::class, DuplicateException::class)
    override fun register(data: RegistrationData): Customer {
        when {
            exclusionList.exclude(data) -> throw ExcludedException()
            else -> return customers.add(data.name, data.email).orThrow()
        }
    }

    override fun registerToo(
        data: RegistrationData
    ): Result<Customer, RegistrationProblem> {
        return when {
            exclusionList.exclude(data) -> Failure(Excluded)
            else -> customers.add(data.name, data.email)
                .mapFailure { exception: DuplicateException ->
                    Duplicate(exception.message)
                }
        }
    }
}