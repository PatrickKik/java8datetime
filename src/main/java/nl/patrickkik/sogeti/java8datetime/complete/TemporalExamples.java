package nl.patrickkik.sogeti.java8datetime.complete;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Examples of working with the Java SE 8 Date Time API
 * <p/>
 * Many thanks to The Java(tm) Tutorials.
 *
 * @author Patrick Kik
 */
public class TemporalExamples {

    public static void main(String[] args) {

        // Check if a field is supported
        System.out.println(LocalDate.now().isSupported(ChronoField.YEAR));
        System.out.println(LocalDate.now().isSupported(ChronoField.MINUTE_OF_HOUR));

        // Adjusting a date or time (simple)
        System.out.println(LocalDate.now().with(t -> t.plus(1, ChronoUnit.MONTHS))); // Functional interface!

        // Adjusting a date or time (more complex)
        System.out.println(LocalDate.now().with(t -> {
            LocalDate ld = (LocalDate) t;
            if (ld.getDayOfMonth() <= 15) {
                return ld.withDayOfMonth(15);
            }
            return ld.plusMonths(1).withDayOfMonth(15);
        }));

        // Querying a date
        System.out.println((Boolean) LocalDate.of(2014, Month.SEPTEMBER, 6).query(t -> {
            LocalDate ld = (LocalDate) t;
            return ld.getDayOfWeek().equals(DayOfWeek.SATURDAY) || ld.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        }));

    }
}
