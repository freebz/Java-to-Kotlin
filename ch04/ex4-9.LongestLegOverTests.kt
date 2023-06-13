// 예제 4.9 [nullability.7:src/test/java/travelator/LongestLegOverTests.kt]

@Test
fun `is absent when no legs`() {
    assertNull(longestLegOver(emptyList(), Duration.ZERO))
}

@Test
fun `is absent when no legs long enough`() {
    assertNull(longestLegOver(legs, ondDay))
}