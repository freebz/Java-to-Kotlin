// 예제 6.15 [collections.8:src/test/java/travelator/LongestJourneyInTests.java]

@Test public void returns_limit_results() {
    assertEquals(
        List.of(longJourney, mediumJourney),
        longestJourneysIn(List.of(shortJourney, mediumJourney, longJourney), 2)
    );
}