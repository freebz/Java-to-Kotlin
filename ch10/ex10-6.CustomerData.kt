// 예제 10.6 [extensions.2:src/main/java/travelator/marketing/CustomerData.kt]

data class CustomerData(
    val id: String,
    val givenName: String,
    val familyName: String,
    val score: Int,
    val spend: Double
)