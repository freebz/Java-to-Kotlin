// 예제 15.28 [encapsulated-collections.10:src/main/java/travelator/UI.java]

public void renderWithHeader(List<Journey> route) {
    renderHeader(
        RouteKt.getDepartsFrom(route),
        RouteKt.getArivesAt(route),
        RouteKt.getDuration(route)
    );
    for (var journey : route) {
        render(journey);
    }
}