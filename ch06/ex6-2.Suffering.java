// 예제 6.2 [collections.1:src/main/java/travelator/Suffering.java]

public static int sufferScoreFor(List<Journey> route) {
    List<Journey> longestJourneys = longestJourneysIn(route, 3);
    return sufferScore(longestJourneys, getDepartsFrom(route));
}