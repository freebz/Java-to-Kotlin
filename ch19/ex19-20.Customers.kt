// 예제 19.20 [errors.15:src/main/java/travelator/Customers.kt]

interface Customers {

    fun add(name: String, email: String): Result<Customer, DuplicateException>

    fun find(id: String): Optional<Customer>
}