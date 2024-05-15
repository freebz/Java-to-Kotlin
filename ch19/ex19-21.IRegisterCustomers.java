// 예제 19.21 [errors.15:src/main/java/travelator/IRegisterCustomers.java]

public interface IRegisterCustomers {
    Customer register(RegistrationData data)
        throws ExcludedException, DuplicateException;
}