// 예제 11.8 [methods-to-properties.5:src/main/java/travelator/CampSites.kt]

fun Set<CampSite>.sitesInRegion(
    countryISO: String,
    region: String
): Set<CampSite> {
    return stream()
        .filter { campSite: CampSite ->
            compSite.countryCode == countryISO &&
                campSite.region.equals(region, ignoreCase = true)
        }
        .collect(Collectors.toUnmodifiableSet())
}