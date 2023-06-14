// 예제 5.11 [beans-to-values.7:src/main/java/travelator/mobile/PreferencesView.kt]

class PreferencesView : View() {
    private val greetingPicker = GreetingPicker()
    private var localePicker = LocalePicker()
    private var currencyPicker = CurrencyPicker()

    fun showModal(preferences: UserPreferences): UserPreferences {
        greetingPicker.greeting = preferences.greeting
        localePicker.locale = preferences.locale
        currencyPicker.currency = preferences.currency
        show()
        return UserPreferences(
            greeting = greetingPicker.greeting,
            locale = localePicker.locale,
            currency = currencyPicker.currency
        )
    }
}