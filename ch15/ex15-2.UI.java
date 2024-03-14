// 예제 15.2 [encapsulated-collections.0:src/main/java/travelator/UI.java]

public void render(Iterable<Journey> route) {
    for (var journey : route) {
        render(journey);
    }
}