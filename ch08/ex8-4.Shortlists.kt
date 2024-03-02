// 예제 8.4 [static-to-top-level.5:src/main/java/travelator/Shortlists.kt]

object Shortlists {
    @JvmStatic
    fun <T> sorted(shortlist: List<T>, ordering: Comparator<in T>): List<T> {
        return shortlist.stream().sorted(ordering)
            .collect(toUnmodifiableList())
    }

    @JvmStatic
    fun <T> removeItemAt(shortlist: List<T>, index: Int): List<T> {
        return Stream.concat(
            shortlist.stream().limit(index.toLong()),
            shortlist.stream().skip((index + 1).toLong())
        ).collect(toUnmodifiableList())
    }

    @JvmStatic
    fun byRating(): Comparator<HasRating> {
        return comparingDouble(HasRating::getRating).reversed()
    }

    @JvmStatic
    fun byPriceLowToHigh(): Comparator<HasPrice> {
        return comparing(HasPrice::getPrice)
    }
    ... 그 외 다른 Comparator
}