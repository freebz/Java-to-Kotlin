// 예제 19.3 [errors.0:src/main/java/travelator/Customers.java]

public interface Customers {

    Customer add(String name, String email) throws DuplicateException;

    Optional<Customer> find(String id);
}