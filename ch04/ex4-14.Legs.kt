// 예제 4.14 [nullability.11:src/main/java/travelator/Legs.kt]

fun longestLegOver(
    legs: List<Leg>,
    duration: Duration
): Leg? {
    var result: Leg? = null
    for (leg in legs) {
        if (isLongerThan(leg, duration))
            if (result == null ||
                leg.isLongerThan(result.plannedDuration)) 
                result = leg
    }
    return result
}

private fun Leg.isLongerThan(duration: Duration) =
    plannedDuration.compareTo(duration) > 0