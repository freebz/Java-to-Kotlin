// 예제 8.13 [static-to-top-level.12:src/main/java/travelator/Shortlists.kt]

fun <T> List<T>.sorted(ordering: Comparator<in T>): List<T> {
    return sortedWith(ordering)
}