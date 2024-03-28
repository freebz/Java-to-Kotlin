// 예제 17.4 [interfaces-to-funs.1:src/test/java/travelator/recommendations/RecommendationsTests.java]

when(featuredDestinations.findCloseTo(paris))
    .thenReturn(List.of(
        eiffelTower,
        louvre
    ));
when(distanceCalculator.distanceInMetersBetween(
    paris, eiffelTower.getLocation())
).thenReturn(5000);
when(distanceCalculator.distanceInMetersBetween(
    paris, louvre.getLocation())
).thenReturn(1000);

when(featuredDestinations.findCloseTo(alton))
    .thenReturn(List.of(
        flowerFarm,
        watercressLine
    ));
when(featuredCalculator.distanceInMetersBetween(
    alton, flowerFarm.getLocation())
).thenReturn(5300);
when(distanceCalculator.distanceInMetersBetween(
    alton, watercressLine.getLocation())
).thenReturn(320);