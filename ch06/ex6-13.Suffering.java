// 예제 6.13 [collections.7:src/main/java/travelator/Suffering.java]

public static List<List<Journey>> routesToShowFor(String itineraryId) {
    return routesFor(bearable(itineraryId));
}

private static List<List<Journey>> bearable
    (List<List<Journey>> routes
) {
    return routes.stream()
        .filter(route -> sufferScoreFor(route) <= 10)
        .collect(toUnmodifiableList());
}