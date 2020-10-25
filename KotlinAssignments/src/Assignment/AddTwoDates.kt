package Assignment

import sun.util.calendar.BaseCalendar
import java.time.LocalDate
import java.time.Period
import java.util.*
import java.util.zip.DataFormatException

fun main() {
    var date1 = LocalDate.of(2019, 11, 14)
    var date2 = LocalDate.of(2019,11,20)
    var output = Period.between(date1,date2)
    println(output)
}


