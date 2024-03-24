// 예제 16.9 [interfaces-to-funs.5:src/main/java/travelator/recommendations/Recommendations.kt]

class Recommendations(
    private val featuredDestinations: FeaturedDestinations,
    private val distanceCalculator: DistanceCalculator,
    private val destinationFinder:
        (Location) -> List<FeaturedDestination> =
        featuredDestinations::findCloseTo
) {