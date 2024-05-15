// 예제 19.39 [errors.27:src/main/java/travelator/CustomerRegistration.kt]

override fun register(
    data: RegistrationData
): Result<Customer, RegistrationProblem> {
    return when {
        exclusionList.exclude(data) -> Failure(Excluded)
        else -> customers.add(data.name, data.email)
            .mapFailure { problem: CustomersProblem ->
                when (problem) {
                    is DuplicateCustomerProblem ->
                        Duplicate(problem.message)
                    is DatabaseCustomerProblem ->
                        DatabaseProblem(problem.message)
                }
            }
    }
}