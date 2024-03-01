// 예제 6.20 [collections.10:src/main/java/travelator/Suffering.kt]

private fun bearable(routes: List<List<Journey>>): List<List<Journey>> {
    return routes.stream()
        .filter { route -> sufferScoreFor(route) <= 10 }
        .collect(Collectors.toUnmodifiableList())
}