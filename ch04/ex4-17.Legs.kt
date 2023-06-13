// 예제 4.17 [nullability.14:src/main/java/travelator/Legs.kt]

fun longestLegOver(
    legs: List<Leg>,
    duration: Duration
): Leg? {
    val longestLeg: Leg? = legs.maxByOrNull(Leg::plannedDuration) ?:
    return null
    return if (longestLeg.plannedDuration > duration)
        longestLeg
    else
        null
}