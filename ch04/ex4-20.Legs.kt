// 예제 4.20 [nullability.16:src/main/java/travelator/Legs.kt]

fun longestLegOver(
    legs: List<Leg>,
    duration: Duration
): Leg? =
    legs.maxByOrNull(Leg::plannedDuration)?.takeIf { longestLeg ->
        longestLeg.plannedDuration > duration
    }