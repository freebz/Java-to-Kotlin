// 예제 19.40 [errors.27:src/main/java/travelator/handlers/CustomerRegistrationHandler.kt]

private fun RegistrationProblem.toResponse() = when (this) {
    is Duplicate -> Response(HTTP_CONFLICT)
    is Excluded -> Response(HTTP_FORBIDDEN)
    is DatabaseProblem -> Response(HTTP_INTERNAL_ERROR)
}