// 예제 11.12 [methods-to-properties.9:src/main/java/travelator/CampSites.kt]

fun CampSite.isIn(countryISO: String, region: String? = null) =
    countryCode == countryISO &&
        region?.equals(region, ignoreCase = true) ?: true