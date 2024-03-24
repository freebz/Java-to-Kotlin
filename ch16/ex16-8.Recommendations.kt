// 예제 16.8 [interfaces-to-funs.4:src/main/java/travelator/recommendations/Recommendations.kt]

class Recommendations(
    private val featuredDestinations: FeaturedDestinations,
    private val distanceCalculator: DistanceCalculator
) {
    private val destinationFinder:
                (Location) -> List<FeaturedDestination> =
        featuredDestinations::findCloseTo

    ...
    
    fun recommendationsFor(
        location: Location
    ): List<FeaturedDestinationSuggestion> =
        destinationFinder(location)
            .map { featuredDestination ->
                FeaturedDestinationSuggestion(
                    location,
                    featuredDestination,
                    distanceCalculator.distanceInMetersBetween(
                        location,
                        featuredDestination.location
                    )
                )
            }
}