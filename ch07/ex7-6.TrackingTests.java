// 예제 7.6 [actions.0:src/test/java/travelator/TrackingTests.java]

public class TrackingTests {

    final StoppedClock clock = new StoppedClock();
    final InMemoryTrips trips = new InMemoryTrips(clock);
    final Tracking tracking = new Tracking(trips);

    @Test
    public void returns_empty_when_no_trip_planned_to_happen_now() {
        clock.now = asInstance();
        assertEquals(
                Optional.empty(),
                tracking.currentTripFor("aCustomer")
        );
    }

    @Test
    public void returns_single_active_booked_trip() {
        var diwaliTrip = givenATrip("cust1", "Diwali",
                "2020-11-13", "2020-11-15", BOOKED);
        givenATrip("cust1", "Christmas",
                "2020-12-24", "2020-11-26", BOOKED);
        clock.now = diwaliTrip.getPlannedStartTime().toInstant();
        assertEquals(
                Optional.of(diwaliTrip),
                tracking.currentTripFor("cust1")
        );
    }

    ...
}