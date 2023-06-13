// 예제 4.22 [nullability.0:src/main/java/travelator/Legs.java]

public class Legs {
    public static Optional<Leg> findLongestLegOver(
            List<Leg> legs,
            Duration duration
    ) {
        Leg result = null;
        for (Leg leg : legs) {
            if (isLongerThan(leg, duration))
                if (result == null ||
                        isLongerThan(leg, result.getPlannedDuration())
                ) {
                    result = leg;
                }
        }
        return Optional.ofNullable(result);
    }

    private static boolean isLongerThan(Leg leg, Duration duration) {
        return leg.getPlannedDuration().compareTo(duration) > 0;
    }
}