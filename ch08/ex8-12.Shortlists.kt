// 예제 8.12 [static-to-top-level.11:src/main/java/travelator/Shortlists.kt]

fun <T> sorted(shortlist: List<T>, ordering: Comparator<in T>): List<T> {
    return shortlist.sortedWith(ordering)
}