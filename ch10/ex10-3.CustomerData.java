// 예제 10.3 [extensions.0:src/main/java/travelator/marketing/CustomerData.java]

public class CustomerData {
    public final String id;
    public final String givenName;
    public final String familyName;
    public final int score;
    public final double spend;

    public CustomerData(
        String id,
        String givenName,
        String familyName,
        int score,
        double spend
    ) {
        this.id = id;
        this.givenName = givenName;
        this.familyName = familyName;
        this.score = score;
        this.spend = spend;
    }
    ... equals와 hashcode 정의
}