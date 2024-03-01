// 예제 6.9 [collections.4:src/main/java/travelator/Suffering.java]

public static int sufferScoreFor(List<Journey> route) {
    return sufferScore(
        longestJourneysIn(route, 3),
        getDepartsFrom(route));
}