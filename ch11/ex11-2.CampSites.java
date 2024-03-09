// 예제 11.2 [methods-to-properties.0:src/main/java/travelator/CampSites.java]

public class CampSites {
    public static Set<CampSite> sitesInRegion(
        Set<CampSite> sites,
        String countryISO,
        String region
    ) {
        return sites.stream()
            .filter( campSite ->
                compSite.getCountryCode().equals(countryISO) &&
                    campSite.region().equalsIgnoreCase(region)
            )
            .collect(toUnmodifiableSet());
    }
}