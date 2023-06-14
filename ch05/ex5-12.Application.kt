// 예제 5.12 [beans-to-values.7:src/main/java/travelator/mobile/Application.kt]

class Application(
    private var preferences: UserPreferences
) {
    fun showWelcome() {
        WelcomeView(preferences).show()
    }

    fun editPreferences() {
        preferences = PreferencesView().showModal(preferences)
    }
    ...
}