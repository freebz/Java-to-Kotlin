// 예제 6.8 [collections.3:src/main/java/travelator/Suffering.java]

static List<Journey> longestJourneysIn(
    List<Journey> journeys,
    int limit
) {
    var actualLimit = Math.min(journeys.size(), limit);
    return sorted(
        journeys,
        comparing(Journey::getDuration).reversed()
    ).subList(0, actualLimit);
}