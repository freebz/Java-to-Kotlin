// 예제 19.35 [errors.25:src/main/java/travelator/Customers.kt]

interface Customers {
    fun add(name: String, email: String): Result<Customer, DuplicateException>
    fun find(id: String): Optional<Customer>
}