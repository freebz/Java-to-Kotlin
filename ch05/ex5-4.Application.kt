// 예제 5.4 [beans-to-values.1:src/main/java/travelator/mobile/Application.kt]

class Application(
    private val preferences: UserPreferences
) {
    fun showWelcome() {
        WelcomeView(preferences).show()
    }
    fun editPreferences() {
        PreferencesView(preferences).show()
    }
    ...
}