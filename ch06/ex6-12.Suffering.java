// 예제 6.12 [collections.6:src/main/java/travelator/Suffering.java]

public static List<List<Journey>> routesToShowFor(String itineraryId) {
    var routes = routesFor(itineraryId);
    bearable(routes);
    return routes;
}

private static List<List<Journey>> bearable
    (List<List<Journey>> routes
) {
    return routes.stream()
        .filter(route -> sufferScoreFor(route) <= 10)
        .collect(toUnmodifiableList());
}