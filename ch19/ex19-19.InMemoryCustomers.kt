// 예제 19.19 [errors.15:src/test/java/travelator/InMemoryCustomers.kt]

class InMemoryCustomers : Customers {

    private val list: MutableList<Customer> = ArrayList()
    private var id = 0

    override fun add(name: String, email: String)
        : Result<Customer, DuplicateException> =
        when {
            list.any { it.email == email } -> Failure(
                DuplicateException(
                    "customer with email $email already exists"
                )
            )
            else -> {
                val result = Customer(id++.toString(), name, email)
                list.add(result)
                Success(result)
            }
        }
    
    override fun find(id: String): Optional<Customer> =
        list.firstOrNull { it.id == id }.toOptional()
    
    // 테스트용
    fun add(customer: Customer) {
        list.add(customer)
    }

    fun size(): Int = list.size
}