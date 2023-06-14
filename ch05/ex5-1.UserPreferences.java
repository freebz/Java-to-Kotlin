// 예제 5.1 [beans-to-values.0:src/main/java/travelator/mobile/UserPreferences.java]

public class UserPreferences {
    
    private String greeting;
    private Locale locale;
    private Currency currency;

    public UserPreferences() {
        this("Hello", Locale.UK, Currency.getInstance(Locale.UK))
    }

    public UserPreferences(String greeting, Locale locale, Currency currency) {
        this.greeting = greeting;
        this.locale = locale;
        this.currency = currency;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    ... 로케일과 통화 처리를 위한 게터와 세터
}