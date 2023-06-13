// 예제 4.8 [nullability.6:src/test/java/travelator/LongestLegOverTests.kt]

@Test
fun is_absent_when_no_legs() {
    assertEquals(
        Optional.empty<Any>(),
        findLongestLegOver(emptyList(), Duration.ZERO)
    )
}

@Test
fun is_absent_when_no_legs_long_enough() {
    assertEquals(
        Optional.empty<Any>(),
        findLongestLegOver(legs, ondDay)
    )
}