// 예제 4.7 [nullability.6:src/main/java/travelator/Legs.kt]

@JvmStatic
fun findLongestLegOver(
    legs: List<Leg>,
    duration: Duration
): Optional<Leg> {
    return Optional.ofNullable(longestLegOver(legs, duration))
}