// 예제 19.16 [errors.13:src/test/java/travelator/InMemoryCustomers.java]

@SuppressWarnings("unchecked")
@Override
public Result<Customer, DuplicateException> addToo(
    String name, String email
) {
    if (list.stream().anyMatch( item -> item.getEmail().equals(email)))
        return new Failure<>(
            new DuplicateException(
                "customer with email " + email + " already exists"
            )
        );
    int newId = id++;
    Customer result = new Customer(Integer.toString(newId), name, email);
    list.add(result);
    return new Success<Customer>(result);
}