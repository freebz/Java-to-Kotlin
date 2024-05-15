// 예제 19.8 [errors.6:src/main/java/travelator/CustomerRegistration.kt]

class CustomerRegistration(
    private val customers: Customers,
    private val exclusionList: ExclusionList
) : ICustomerRegistration {

    @Throws(ExcludedException::class, DuplicateException::class)
    override fun register(data: RegistrationData): Customer {
        return if (exclusionList.exclude(data)) {
            throw ExcludedException()
        } else {
            customers.add(data.name, data.email)
        }
    }
}