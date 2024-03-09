// 예제 11.6 [methods-to-properties.3:src/main/java/travelator/CampSites.java]

public static Set<CampSite> sitesInRegion(
    Set<CampSite> sites,
    String countryISO,
    String region
) {
    return sites.stream()
        .filter( campSite ->
            compSite.getCountryCode().equals(countryISO) &&
                campSite.getRegion().equalsIgnoreCase(region)
        )
        .collect(toUnmodifiableSet());
}