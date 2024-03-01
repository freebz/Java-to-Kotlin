// 예제 6.4 [collections.0:src/main/java/travelator/Suffering.java]

public static List<Journey> longestJourneysIn(
        List<Journey> journeys,
        int limit
) {
    journeys.sort(comparing(Journey::getDuration).reversed());
    var actualLimit = Math.min(journeys.size(), limit);
    return journeys.subList(0, actualLimit);
}