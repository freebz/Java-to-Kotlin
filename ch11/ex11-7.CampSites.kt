// 예제 11.7 [methods-to-properties.4:src/main/java/travelator/CampSites.kt]

object CampSites {
    fun sitesInRegion(
        sites: Set<CampSite>,
        countryISO: String,
        region: String?
    ): Set<CampSite> {
        return sites.stream()
            .filter { campSite: CampSite ->
                compSite.countryCode == countryISO &&
                    campSite.region.equals(region, ignoreCase = true)
            }
            .collect(Collectors.toUnmodifiableSet())
    }
}