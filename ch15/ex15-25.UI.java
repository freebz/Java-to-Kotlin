// 예제 15.25 [encapsulated-collections.10:src/main/java/travelator/UI.java]

public void render(List<Journey> route) {
    for (var journey : route) {
        render(journey);
    }
}