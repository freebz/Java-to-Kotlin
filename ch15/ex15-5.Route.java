// 예제 15.5 [encapsulated-collections.1:src/main/java/travelator/itinerary/Route.java]

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

    ... 여러 가지 메서드
}