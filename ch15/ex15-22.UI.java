// 예제 15.22 [encapsulated-collections.8:src/main/java/travelator/UI.java]

public void render(List<Journey> route) {
    for (int i = 0; i < RouteKt.getSize(route); i++) {
        var journey = RouteKt.get(route, i);
        render(journey);
    }
}