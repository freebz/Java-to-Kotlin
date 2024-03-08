// 예제 10.4 [extensions.1:src/main/java/travelator/marketing/CustomerData.java]

public class CustomerData {
    public final String id;
    public final String givenName;
    public final String familyName;
    public final int score;
    public final double spend;

    ...

    public String getId() {
        return id;
    }

    public String getGivenName() {
        return givenName;
    }
    ...
}