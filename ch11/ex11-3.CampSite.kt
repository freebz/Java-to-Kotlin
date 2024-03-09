// 예제 11.3 [methods-to-properties.1:src/main/java/travelator/CampSite.kt]

data class CampSite(
    val id: String,
    val name: String,
    val address: Address,
    ...
) {
    val getCountryCode: String 
        get() = address.countryCode
    }

    fun region(): String {
        return address.region
    }
    ...
}