// 예제 5.10 [beans-to-values.6:src/main/java/travelator/mobile/UserPreferences.kt]

data class UserPreferences(
    val greeting: String,
    val locale: Locale,
    val currency: Currency
)