// 예제 19.27 [errors.19:src/main/java/travelator/handlers/CustomerRegistrationHandler.kt]

fun handle(request: Request): Response =
    try {
        val data = objectMapper.readValue(
            request.body,
            RegistrationData::class.java
        )
        registration.registerToo(data)
            .map { value ->
                Response(
                    HTTP_CREATED,
                    objectMapper.writeValueAsString(customerResult.value)
                )
            }
            .recover { reason -> reason.toResponse() }
    } catch (x: JsonProcessingException) {
        Response(HTTP_BAD_REQUEST)
    } catch (x: Exception) {
        Response(HTTP_INTERNAL_ERROR)
    }