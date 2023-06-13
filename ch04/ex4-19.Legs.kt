// 예제 4.19 [nullability.17:src/main/java/travelator/Legs.kt]

fun longestLegOver(
    legs: List<Leg>,
    duration: Duration
): Leg? {
    val longestLeg = legs.maxByOrNull(Leg::plannedDuration)
    return when {
        longestLeg == null -> null
        longestLeg.plannedDuration > duration -> longestLeg
        else -> null
    }
}