// 예제 6.11 [collections.5:src/main/java/travelator/Suffering.java]

public static List<List<Journey>> routesToShowFor(String itineraryId) {
    var routes = routesFor(itineraryId);
    removeUnbearableRoutes(routes);
    return routes;
}

private static List<List<Journey>> removeUnbearableRoutes
    (List<List<Journey>> routes
) {
    routes.removeIf(route -> sufferScoreFor(route) > 10);
    return routes;
}