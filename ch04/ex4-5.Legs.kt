// 예제 4.5 [nullability.4:src/main/java/travelator/Legs.kt]

@JvmStatic
fun findLongestLegOver(
    legs: List<Leg>,
    duration: Duration
): Optional<Leg> {
    var result: Leg? = null
    for (leg in legs) {
        if (isLongerThan(leg, duration))
            if (result == null ||
                isLongerThan(leg, result.plannedDuration)) 
                result = leg
    }
    return Optional.ofNullable(result)
}