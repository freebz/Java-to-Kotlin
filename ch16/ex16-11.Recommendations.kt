// 예제 16.11 [interfaces-to-funs.6:src/main/java/travelator/recommendations/Recommendations.kt]

class Recommendations(
    private val distanceCalculator: DistanceCalculator,
    private val destinationFinder: (Location) -> List<FeaturedDestination>
) {