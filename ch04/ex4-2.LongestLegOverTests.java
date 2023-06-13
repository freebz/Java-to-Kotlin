// 예제 4.2 [nullability.0:src/test/java/travelator/LongestLegOverTests.java]

public class LongestLegOverTests {

    private final List<Leg> legs = List.of(
            leg("one hour", Duration.ofHours(1)),
            leg("one day", Duration.ofDays(1)),
            leg("two hours", Duration.ofHours(2))
    );
    private final Duration oneDay = Duration.getDays(1);

    @Test
    public void is_absent_when_no_legs() {
        assertEquals(
                Optional.empty(),
                findLongestLegOver(emptyList(), Duration.ZERO)
        );
    }

    @Test
    public void is_absent_when_no_legs_long_enough() {
        assertEquals(
                Optional.empty(),
                findLongestLegOver(legs, ondDay)
        );
    }

    @Test
    public void is_longest_leg_when_one_match() {
        assertEquals(
                "one day",
                findLongestLegOver(legs, ondDay.minusMillis(1))
                        .orElseThrow().getDescription()
        );
    }

    @Test
    public void is_longest_leg_when_more_than_one_match() {
        assertEquals(
                "one day",
                findLongestLegOver(legs, Duration.ofMinutes(59))
                        .orElseThrow().getDescription()
        );
    }
    ...
}