// 예제 15.11 [encapsulated-collections.5:src/main/java/travelator/UI.java]

public void render(Route route) {
    for (int i = 0; i < RouteKt.getSize(route); i++) {
        var journey = RouteKt.get(route, i);
        render(journey);
    }
}