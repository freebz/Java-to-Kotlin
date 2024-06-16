// 예제 22.66 [table-reader.49:src/main/java/travelator/tablereader/table-reading.kt]

fun <T> Sequence<T>.destruct()
    : Pair<T, Sequence<T>>? {
    val iterator = this.iterator()
    return when {
        iterator.hasNext() ->
            iterator.next() to iterator.asSequence()
        else -> null
    }
}