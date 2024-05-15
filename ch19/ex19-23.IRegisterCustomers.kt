// 예제 19.23 [errors.16:src/main/java/travelator/IRegisterCustomers.kt]

sealed class RegistrationProblem

object Excluded : RegistrationProblem()

data class Duplicate(
    val message: String?
) : RegistrationProblem()