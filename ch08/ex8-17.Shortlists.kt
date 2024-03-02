// 예제 8.17 [static-to-top-level.14:src/main/java/travelator/Shortlists.kt]

fun <T> Iterable<T>.sorted(ordering: Comparator<in T>): List<T> =
    sortedWith(ordering)

fun <T> Iterable<T>.withoutItemAt(index: Int): List<T> =
    take(index) + drop(index + 1)

fun byRating(): Comparator<HasRating> =
    comparingDouble(HasRating::getRating).reversed()

fun byPriceLowToHigh(): Comparator<HasPrice> =
    comparing(HasPrice::getPrice)

... 그 외 다른 Comparator