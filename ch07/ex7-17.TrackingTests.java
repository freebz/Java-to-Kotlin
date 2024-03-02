// 예제 7.17 [actions.8:src/test/java/travelator/TrackingTests.java]

public class TrackingTests {

    final InMemoryTrips trips = new InMemoryTrips();
    final Tracking tracking = new Tracking(trips);

    @Test
    public void returns_empty_when_no_trip_planned_to_happen_now() {
        assertEquals(
                Optional.empty(),
                tracking.currentTripFor("cust1", asInstance())
        );
    }

    @Test
    public void returns_single_active_booked_trip() {
        var diwaliTrip = givenATrip("cust1", "Diwali",
                "2020-11-13", "2020-11-15", BOOKED);
        givenATrip("cust1", "Christmas",
                "2020-12-24", "2020-11-26", BOOKED);
        assertEquals(
                Optional.of(diwaliTrip),
                tracking.currentTripFor("cust1",
                        diwaliTrip.getPlannedStartTime().toInstant())
        );
    }