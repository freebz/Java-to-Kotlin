// 예제 4.11 [nullability.8:src/test/java/travelator/LongestLegOverTests.kt]

@Test
fun `is longest leg when one match`() {
    assertEquals(
        "one day",
        longestLegOver(legs, ondDay.minusMillis(1))
        !!.getDescription()
    )
}

@Test
fun `is longest leg when more than one match`() {
    assertEquals(
        "one day",
        longestLegOver(legs, Duration.ofMinutes(59))
            ?.getDescription()
    )
}