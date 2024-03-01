// 예제 6.1 [collections.0:src/main/java/travelator/Suffering.java]

public static int sufferScoreFor(List<Journey> route) {
    Location start = getDepartsFrom(route);
    List<Journey> longestJourneys = longestJourneysIn(route, 3);
    return sufferScore(longestJourneys, start);
}