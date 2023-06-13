// 예제 4.21 [nullability.18:src/main/java/travelator/Legs.kt]

fun List<Leg>.longestLegOver(duration: Duration): Leg? {
    val longestLeg = maxByOrNull(Leg::plannedDuration)
    return when {
        longestLeg == null -> null
        longestLeg.plannedDuration > duration -> longestLeg
        else -> null
    }
}