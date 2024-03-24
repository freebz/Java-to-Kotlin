// 예제 16.13 [interfaces-to-funs.7:src/main/java/travelator/recommendations/Recommendations.kt]

class Recommendations(
    private val destinationFinder: (Location) -> List<FeaturedDestination>,
    private val distanceInMetersBetween: (Location, Location) -> Int
) {
    ...
    fun recommendationsFor(
        location: Location
    ): List<FeaturedDestinationSuggestion> =
        destinationFinder(location)
            .map { featuredDestination ->
                FeaturedDestinationSuggestion(
                    location,
                    featuredDestination,
                    distanceInMetersBetween(
                        location,
                        featuredDestination.location
                    )
                )
            }
}