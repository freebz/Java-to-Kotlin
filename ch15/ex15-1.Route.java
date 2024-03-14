// 예제 15.1 [encapsulated-collections.0:src/main/java/travelator/itinerary/Route.java]

public class Route {
    private final List<Journey> journeys;

    public Route(List<Journey> journeys) {
        this.journeys = journeys;
    }

    public int size() {
        return journeys.size();
    }

    public Journey get(int index) {
        return journeys.get(index);
    }

    public Location getDepartsFrom() {
        return get(0).getDepartsFrom();
    }

    public Location getArivesAt() {
        return get(size() - 1).getArivesAt();
    }

    public Duration getDuration() {
        return Duration.between(
            get(0).getDepartureTime(),
            get(size() - 1).getArrivalTime());
    }

    ...
}