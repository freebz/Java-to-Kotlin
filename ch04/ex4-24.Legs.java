// 예제 4.24 [nullability.2:src/main/java/travelator/Legs.java]

public static Optional<Leg> findLongestLegOver(
        List<Leg> legs,
        Duration duration
) {
    return legs.stream()
            .max(Comparator.comparing(Leg::getPlannedDuration))
            .filter(leg -> isLongerThan(leg, duration));
}