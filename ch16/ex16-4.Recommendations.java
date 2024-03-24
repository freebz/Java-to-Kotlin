// 예제 16.4 [interfaces-to-funs.0:src/main/java/travelator/recommendations/Recommendations.java]

public List<FeaturedDestinationSuggestion> recommendationsFor(
        Set<Location> journey
) {
    var results = removeDuplications(
        journey.stream()
            .flatMap(location ->
                recommendationsFor(location).stream()
            )
        );
    results.sort(distanceComparator);
    return results;
}

public List<FeaturedDestinationSuggestion> recommendationsFor(
    Location location
) {
    return featuredDestinations
        .findCloseTo(location)
        .stream()
        .map(featuredDestination ->
            new FeaturedDestinationSuggestion(
                location,
                featuredDestination,
                distanceCalculator.distanceInMetersBetween(
                    location,
                    featuredDestination.getLocation()
                )
            )
        ).collect(toList());
}