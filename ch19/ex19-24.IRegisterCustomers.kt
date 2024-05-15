// 예제 19.24 [errors.16:src/main/java/travelator/IRegisterCustomers.kt]

interface IRegisterCustomers {
    @Throws(ExcludedException::class, DuplicateException::class)
    fun register(data: RegistrationData): Customer
    fun registerToo(data: RegistrationData):
            Result<Customer, RegistrationProblem> =
        try {
            Success(register(data))
        } catch (x: ExcludedException) {
            Failure(Excluded)
        } catch (x: DuplicateException) {
            Failure(Duplicate(x.message))
        }
}