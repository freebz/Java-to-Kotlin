// 예제 4.15 [nullability.12:src/main/java/travelator/Legs.kt]

fun longestLegOver(
    legs: List<Leg>,
    duration: Duration
): Leg? {
    val longestLeg: Leg? = legs.maxByOrNull(Leg::plannedDuration)
    if (longestLeg != null && longestLeg.plannedDuration > duration)
        return longestLeg
    else
        return null
}