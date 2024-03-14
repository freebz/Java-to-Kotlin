// 예제 15.24 [encapsulated-collections.10:src/main/java/travelator/UI.java]

public void render(List<Journey> route) {
    for (int i = 0; i < route.size(); i++) {
        var journey = route.get(i);
        render(journey);
    }
}