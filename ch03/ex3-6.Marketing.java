// 예제 3.6 [classes.0:src/main/java/travelator/Marketing.java]

public class Marketing {
    public static boolean isHotmailAddress(EmailAddress address) {
        return address.getDomain().equalsIgnoreCase("hotmail.com");
    }
}