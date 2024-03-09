// 예제 11.9 [methods-to-properties.6:src/main/java/travelator/CampSites.kt]

fun Iterable<CampSite>.sitesInRegion(
    countryISO: String,
    region: String
): Set<CampSite> =
    filter { site ->
        site.countryCode == countryISO &&
            site.region.equals(region, ignoreCase = true)
    }.toSet()