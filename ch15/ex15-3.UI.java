// 예제 15.3 [encapsulated-collections.0:src/main/java/travelator/UI.java]

public void render(Route route) {
    for (int i = 0; i < route.size(); i++) {
        var journey = route.get(i);
        render(journey);
    }
}