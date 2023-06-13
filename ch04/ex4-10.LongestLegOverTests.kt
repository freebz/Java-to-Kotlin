// 예제 4.10 [nullability.6:src/test/java/travelator/LongestLegOverTests.kt]

@Test
fun is_longest_leg_when_one_match() {
    assertEquals(
        "one day",
        findLongestLegOver(legs, ondDay.minusMillis(1))
            .orElseThrow().getDescription()
    )
}

@Test
fun is_longest_leg_when_more_than_one_match() {
    assertEquals(
        "one day",
        findLongestLegOver(legs, Duration.ofMinutes(59))
            .orElseThrow().getDescription()
    )
}