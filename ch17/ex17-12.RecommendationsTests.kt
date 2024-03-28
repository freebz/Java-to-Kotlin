// 예제 17.12 [mocks-to-maps.3:src/test/java/travelator/recommendations/RecommendationsTests.kt]

private fun <K1, K2, V> Map<Pair<K1, K2>, V>.getValue(k1: K1, k2: K2) =
    getValue(k1 to k2)