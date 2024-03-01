// 예제 6.21 [collections.11:src/main/java/travelator/Suffering.kt]

private fun bearable(routes: List<List<Journey>>): List<List<Journey>> =
    routes.filter { sufferScoreFor(it) <= 10 }