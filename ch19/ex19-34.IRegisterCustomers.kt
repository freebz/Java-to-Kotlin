// 예제 19.34 [errors.25:src/main/java/travelator/IRegisterCustomers.kt]

interface IRegisterCustomers {
    fun register(data: RegistrationData):
            Result<Customer, RegistrationProblem>
}

sealed class RegistrationProblem

object Excluded : RegistrationData()

data class Duplicate(
    val message: String?
) : RegistrationProblem()