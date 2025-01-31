// 예제 6.5 [collections.0:src/main/java/travelator/Suffering.java]

public class Suffering {
    public static int sufferScoreFor(List<Journey> route) {
        Location start = getDepartsFrom(route);
        List<Journey> longestJourneys = longestJourneysIn(route, 3);
        return sufferScore(longestJourneys, start);
    }

    public static List<Journey> longestJourneysIn(
            List<Journey> journeys,
            int limit
    ) {
        journeys.sort(comparing(Journey::getDuration).reversed());
        var actualLimit = Math.min(journeys.size(), limit);
        return journeys.subList(0, actualLimit);
    }

    public static List<List<Journey>> routesToShowFor(String itineraryId) {
        var routes = routesFor(itineraryId);
        removeUnbearableRoutes(routes);
        return routes;
    }

    private static void removeUnbearableRoutes(List<List<Journey>> routes) {
        routes.removeIf(route -> sufferScoreFor(route) > 10);
    }

    private static int sufferScore(
            List<Journey> longestJourneys,
            Location start
    ) {
        return SOME_COMPLICATED_RESULT();
    }
)