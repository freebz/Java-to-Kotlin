// 예제 5.7 [beans-to-values.4:src/main/java/travelator/mobile/PreferencesView.kt]

fun showModal(): UserPreferences {
    greetingPicker.greeting = preferences.greeting
    localePicker.locale = preferences.locale
    currencyPicker.currency = preferences.currency
    show()
    return preferences
}