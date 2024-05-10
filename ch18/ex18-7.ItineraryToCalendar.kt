// 예제 18.7 [open-to-sealed.3:src/main/java/travelator/calendar/ItineraryToCalendar.kt]

fun ItineraryItem.toCalendarEvent(): CalendarEvent? = when (this) {
    is Accommodation -> CalendarEvent(
        start = checkInFrom,
        end = checkOutBefore,
        description = description,
        alarms = listOf(
            Alarm(checkInFrom, "Check in open"),
            Alarm(checkOutBefore.minusHours(1), "Check out")
        )
    )
    is Attraction -> null
    is Journey -> CalendarEvent(
        start = departureTime,
        end = arrivelTime,
        description = description,
        location = departsFrom,
        alrams = listOf(
            Alarm(departureTime.minusHours(1)))
    )
    is RestaurantBooking -> CalendarEvent(
        start = time,
        description = description,
        location = location,
        alarms = listOf(
            Alarm(time.minusHours(1)))
    )
}