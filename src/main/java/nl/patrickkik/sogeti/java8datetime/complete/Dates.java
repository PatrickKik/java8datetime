package nl.patrickkik.sogeti.java8datetime.complete;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * Examples of working with the Java SE 8 Date Time API
 * <p/>
 * Many thanks to The Java(tm) Tutorials.
 *
 * @author Patrick Kik
 */
public class Dates {

    public static void main(String[] args) {

        /* --=[ CREATION OF TYPES ]=-- */

        // Which date is it today?
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // My birthday
        LocalDate myBirthday = LocalDate.of(1982, Month.SEPTEMBER, 23);
        System.out.println(myBirthday);

        // One specific year
        System.out.println(Year.now());

        // From one date to another (Year)
        System.out.println(Year.from(myBirthday));
        System.out.println(Year.of(1999).isLeap());

        // From one date to another (YearMonth)
        System.out.println(YearMonth.from(myBirthday));

        // From one date to another (Month)
        System.out.println(Month.from(now));
        System.out.println(Month.from(now).maxLength());

        // From one date to another (MonthDay)
        System.out.println(MonthDay.from(now));
        System.out.println(MonthDay.of(Month.FEBRUARY, 27).atYear(2003));

        // From one date to another (Day of the week)
        System.out.println(DayOfWeek.from(now));


        /* --=[ MODIFYING TYPES ]=-- */

        // Change one of the fields.
        System.out.println(now.withYear(2000));

        // Adding some time.
        System.out.println(now.plusMonths(1));
        System.out.println(now.plus(3, ChronoUnit.CENTURIES));
        // System.out.println(now.plus(1, ChronoUnit.HALF_DAYS)); // Nope

        // A bit more complex.
        System.out.println(now.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(now.with(TemporalAdjusters.lastDayOfMonth()).format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}
