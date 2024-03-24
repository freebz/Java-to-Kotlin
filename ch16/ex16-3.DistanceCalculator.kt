// 예제 16.3 [interfaces-to-funs.0:src/main/java/travelator/domain/DistanceCalculator.kt]

interface DistanceCalculator(
    fun distanceInMetersBetween(
        start: Location,
        end: Location
    ): Int

    fun travelTimeInSecondsBetween(
        start: Location,
        end: Location
    ): Int
)