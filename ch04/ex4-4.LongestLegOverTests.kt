// 예제 4.4 [nullability.4:src/test/java/travelator/LongestLegOverTests.kt]

class LongestLegOverTests {
    ...
    @Test
    fun is_absent_when_no_legs() {
        Assertions.assertEquals(
            Optional.empty<Any>(),
            findLongestLegOver(emptyList(), Duration.ZERO)
        )
    }

    @Test
    fun is_absent_when_no_legs_long_enough() {
        Assertions.assertEquals(
            Optional.empty<Any>(),
            findLongestLegOver(legs, ondDay)
        )
    }

    @Test
    fun is_longest_leg_when_one_match() {
        Assertions.assertEquals(
            "one day",
            findLongestLegOver(legs, ondDay.minusMillis(1))
                .orElseThrow().getDescription()
        )
    }

    @Test
    fun is_longest_leg_when_more_than_one_match() {
        Assertions.assertEquals(
            "one day",
            findLongestLegOver(legs, Duration.ofMinutes(59))
                .orElseThrow().getDescription()
        )
    }
    ...
}