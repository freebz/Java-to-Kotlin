// 예제 5.2 [beans-to-values.0:src/main/java/travelator/mobile/Application.java]

public class Application {
    private final UserPreferences preferences;

    public Application(UserPreferences preferences) {
        this.preferences = preferences;
    }

    public void showWelcome() {
        new WelcomeView(preferences).show();
    }

    public void editPreferences() {
        new PreferencesView(preferences).show();
    }
    ...
}