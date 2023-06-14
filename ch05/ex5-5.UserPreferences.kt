// 예제 5.5 [beans-to-values.1:src/main/java/travelator/mobile/UserPreferences.kt]

class UserPreferences @JvmOverloads constructor(
    var greeting: String = "Hello",
    var locale: Locale = Locale.UK,
    var currency: Currency = Currency.getInstance(Locale.UK)
)