// 예제 19.6 [errors.5:src/main/java/travelator/Customers.kt]

interface Customers {
    @Throws(DuplicateException::class)
    fun add(name: String, email: String): Customer
    fun addToo(name: String, email: String)
            : Result<Customer, DuplicateException> =
        try {
            Success(add(name, email))
        } catch (x: DuplicateException) {
            Failure(x)
        }
    fun find(id: String): Optional<Customer>
}