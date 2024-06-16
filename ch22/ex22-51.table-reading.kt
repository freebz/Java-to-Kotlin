// 예제 22.51 [table-reader.36:src/main/java/travelator/tablereader/table-reading.kt]

val splitOnComma: (String) -> List<String> = { line ->
    line.splitFields(",")
}