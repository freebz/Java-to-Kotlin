// 예제 13.1 [streams-to-sequences.0:src/main/java/travelator/analytics/EventStore.java]

public interface EventStore {
    
    Iterator<Map<String, Object>> query(String query);

    default Stream<Map<String, Object>> queryAsStream(String query) {
        Iterable<String, Object>> iterable = () -> query(query);
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}