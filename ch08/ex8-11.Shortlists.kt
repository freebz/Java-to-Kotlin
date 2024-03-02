// 예제 8.11 [static-to-top-level.10:src/main/java/travelator/Shortlists.kt]

fun <T> sorted(shortlist: List<T>, ordering: Comparator<in T>): List<T> {
    return shortlist.stream().sorted(ordering)
        .collect(toUnmodifiableList())
}

fun <T> removeItemAt(shortlist: List<T>, index: Int): List<T> {
    return Stream.concat(
        shortlist.stream().limit(index.toLong()),
        shortlist.stream().skip((index + 1).toLong())
    ).collect(toUnmodifiableList())
}

fun byRating(): Comparator<HasRating> {
    return comparingDouble(HasRating::getRating).reversed()
}

fun byPriceLowToHigh(): Comparator<HasPrice> {
    return comparing(HasPrice::getPrice)
}

... 그 외 다른 Comparator