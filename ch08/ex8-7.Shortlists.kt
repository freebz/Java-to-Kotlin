// 예제 8.7 [static-to-top-level.7:src/main/java/travelator/Shortlists.kt]

@JvmStatic
fun <T> sorted(shortlist: List<T>, ordering: Comparator<in T>): List<T> {
    return shortlist.stream().sorted(ordering)
        .collect(toUnmodifiableList())
}