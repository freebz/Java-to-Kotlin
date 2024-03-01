// 예제 6.10 [collections.4:src/main/java/travelator/Suffering.java]

public static List<List<Journey>> routesToShowFor(String itineraryId) {
    var routes = routesFor(itineraryId);
    removeUnbearableRoutes(routes);
    return routes;
}

private static void removeUnbearableRoutes(List<List<Journey>> routes) {
    routes.removeIf(route -> sufferScoreFor(route) > 10);
}