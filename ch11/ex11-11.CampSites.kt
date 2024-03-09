// 예제 11.11 [methods-to-properties.8:src/main/java/travelator/CampSites.kt]

fun CampSite.isIn(countryISO: String, region: String? = null) =
    when (region) {
        null -> countryCode == countryISO
        else -> countryCode == countryISO &&
                region.equals(region, ignoreCase = true)
    }