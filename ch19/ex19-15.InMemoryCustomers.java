// 예제 19.15 [errors.12:src/test/java/travelator/InMemoryCustomers.java]

public class InMemoryCustomers implements Customers {

    private final List<Customer> list = new ArrayList<>();
    private int id = 0;

    @Override
    public Customer add(String name, String email) throws DuplicateException {
        if (list.stream().anyMatch( item -> item.getEmail().equals(email)))
            throw new DuplicateException(
                    "customer with email " + email + " already exists"
            );
        int newId = id;
        Customer result = new Customer(Integer.toString(newId), name, email);
        list.add(result);
        return result;
    }

    @Override
    public Optional<Customer> find(String id) {
        return list.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst();
    }

    // 테스트용
    public void add(Customer customer) {
        list.add(customer);
    }

    public int size() {
        return list.size();
    }
}