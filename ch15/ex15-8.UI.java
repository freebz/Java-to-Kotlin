// 예제 15.8 [encapsulated-collections.3:src/main/java/travelator/UI.java]

public void renderWithHeader(Route route) {
    renderHeader(
        RouteKt.getDepartsFrom(route),
        route.getArrivesAt(),
        route.getDuration()
    );
    for (int i = 0; i < route.size(); i++) {
        var journey = route.get(i);
        render(journey);
    }
}