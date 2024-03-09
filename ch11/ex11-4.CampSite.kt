// 예제 11.4 [methods-to-properties.2:src/main/java/travelator/CampSite.kt]

fun region: String
    get() {
        return address.region
    }