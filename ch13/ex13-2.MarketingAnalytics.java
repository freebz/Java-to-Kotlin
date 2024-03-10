// 예제 13.2 [streams-to-sequences.0:src/main/java/travelator/analytics/MarketingAnalytics.java]

public double averageNumberOfEventsPerCompletedBooking(
    String timeRange
) {
    Stream<Map<String, Object>> eventsForSuccessfulBooking =
        eventStore
            .queryAsStream("type=CompletedBooking&timerange=" + timeRange)
            .flatMap(event -> {
                String interactionId = (String) event.get("interactionId");
                return eventStore.queryAsStream("interactionId=" + interactionId);
            });
    Map<String, List<Map<String, Object>>> bookingEventsByInteractionId =
        eventsForSuccessfulBooking.collect(groupingBy(
            event -> (String) event.get("interactionId"))
        );
    var averageNumberOfEventsPerCompletedBooking =
        bookingEventsByInteractionId
            .values()
            .stream()
            .mapToInt(List::size)
            .average();
    return averageNumberOfEventsPerCompletedBooking.orElse(Double.NaN);
}