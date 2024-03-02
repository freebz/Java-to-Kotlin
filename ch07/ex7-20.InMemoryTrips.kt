// 예제 7.20 [actions.10:src/test/java/travelator/InMemoryTrips.kt]

public class InMemoryTrips : Trips {
    private val trips: MutableMap<String, MutableSet<Trip>> = mutableMapOf()

    fun addTrip(trip: Trip) {
        val existingTrips = trips.getOrDefault(trip.customerId, mutableSetOf())
        existingTrips.add(trip)
        trips[trip.customerId] = existingTrips
    }

    override fun tripsFor(customerId: String) =
        trips.getOrDefault(customerId, emptySet<Trip>())

    override fun currentTripsFor(String customerId, at: Instant): Set<Trip> =
        tripsFor(customerId)
            .filter { it.isPlannedToBeActiveAt(at) }
            .toSet()
}