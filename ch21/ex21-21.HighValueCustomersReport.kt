// 예제 21.21 [exceptions-to-values.7:src/main/java/travelator/marketing/HighValueCustomersReport.kt]

internal fun String.toCustomerData(): Result<CustomerData, ParseFailure> =
    split("\t").let { parts ->
        parts
            .takeUnless { it.size < 4 }
            .asResultOr { NotEnoughFieldsFailure(this) }
            .flatMap { parts ->
                parts[3].toIntOrNull()
                    .asResultOr { ScoreIsNotAnIntFailure(this) }
                    .flatMap { score: Int ->
                        (if (parts.size == 4) 0.0
                        else parts[4].toDoubleOrNull())
                            .asResultOr { SpendIsNotADoubleFailure(this) }
                            .flatMap { spend ->
                                Success(
                                    CustomerData(
                                        id = parts[0],
                                        givenName = parts[1],
                                        familyName = parts[2],
                                        score = score,
                                        spend = spend
                                    )
                                )
                            }
                    }
            }
    }