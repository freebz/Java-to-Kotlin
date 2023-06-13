// 예제 4.16 [nullability.13:src/main/java/travelator/Legs.kt]

fun longestLegOver(
    legs: List<Leg>,
    duration: Duration
): Leg? {
    val longestLeg: Leg? = legs.maxByOrNull(Leg::plannedDuration)
    return if (longestLeg != null && longestLeg.plannedDuration > duration)
        longestLeg
    else
        null
}