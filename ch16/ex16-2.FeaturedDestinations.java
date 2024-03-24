// 예제 16.2 [interfaces-to-funs.0:src/main/java/travelator/destinations/FeaturedDestinations.java]

public interface FeaturedDestinations {
    List<FeaturedDestination> findCloseTo(Location location);
    FeaturedDestination findClosest(Location location);

    FeaturedDestination add(FeaturedDestinationData destination);
    void remove(FeaturedDestination destination);
    void update(FeaturedDestination destination);
}