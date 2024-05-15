// 예제 19.38 [errors.27:src/main/java/travelator/IRegisterCustomers.kt]

sealed class RegistrationProblem

object Excluded : RegistrationProblem()

data class Duplicate(val message: String) : RegistrationProblem()

data class DatabaseProblem(val message: String) : RegistrationProblem()