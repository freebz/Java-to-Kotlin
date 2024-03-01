// 예제 6.6 [collections.3:src/main/java/travelator/Collections.java]

@SuppressWarnings("unchecked")
public static <E> List<E> sorted(
    Collection<E> collection,
    Comparator<? super E> by
) {
    var result = (E[]) collection.toArray();
    Arrays.sort(result, by);
    return Arrays.asList(result);
}