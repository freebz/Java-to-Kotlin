// 예제 19.5 [errors.3:src/main/java/travelator/Customers.kt]

interface Customers {
    @Throws(DuplicateException::class)
    fun add(name: String, email: String): Customer

    fun find(id: String): Optional<Customer>
}