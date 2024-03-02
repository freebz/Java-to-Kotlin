// 예제 8.1 [static-to-top-level.0:src/main/java/travelator/Shortlists.java]

public class Shortlists {
    public static <T> List<T> sorted(
            List<T> shortlist,
            Comparator<? super T> ordering
    ) {
        return shortlist.stream()
                .sorted(ordering)
                .collect(toUnmodifiableList());
    }

    public static <T> List<T> removeItemAt(List<T> shortlist, int index) {
        return Stream.concat(
                shortlist.stream().limit(index),
                shortlist.stream().skip(index + 1)
        ).collect(toUnmodifiableList());
    }

    public static Comparator<HasRating> byRating() {
        return comparingDouble(HasRating::getRating).reversed();
    }

    public static Comparator<HasPrice> byPriceLowToHigh() {
        return comparing(HasPrice::getPrice);
    }

    ... 그 외 다른 Comparator
}