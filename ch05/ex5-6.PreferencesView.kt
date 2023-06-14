// 예제 5.6 [beans-to-values.3:src/main/java/travelator/mobile/PreferencesView.kt]

class PreferencesView(
    private val preferences: UserPreferences
) : View() {
    private val greetingPicker = GreetingPicker()
    private var localePicker = LocalePicker()
    private var currencyPicker = CurrencyPicker()
    override fun show() {
        greetingPicker.greeting = preferences.greeting
        localePicker.locale = preferences.locale
        currencyPicker.currency = preferences.currency
        super.show()
    }
    protected fun onGreetingChange() {
        preferences.greeting = greetingPicker.greeting
    }
    ... onLocaleChange, onCurrencyChange
}