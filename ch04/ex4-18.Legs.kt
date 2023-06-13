// 예제 4.18 [nullability.15:src/main/java/travelator/Legs.kt]

fun longestLegOver(
    legs: List<Leg>,
    duration: Duration
): Leg? =
    legs.maxByOrNull(Leg::plannedDuration)?.let { longestLeg ->
        if (longestLeg.plannedDuration > duration)
            longestLeg
        else
            null
    }