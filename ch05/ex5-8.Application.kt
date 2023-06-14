// 예제 5.8 [beans-to-values.4:src/main/java/travelator/mobile/Application.kt]

class Application(
    private var preferences: UserPreferences
) {
    ...
    fun editPreferences() {
        preferences = PreferencesView(preferences).showModal()
    }
    ...
}