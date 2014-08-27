package nl.patrickkik.sogeti.java8datetime.complete;

import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Examples of working with the Java SE 8 Date Time API
 * <p/>
 * Many thanks to The Java(tm) Tutorials.
 *
 * @author Patrick Kik
 */
public class PeriodDurationExamples {

    public static void main(String[] args) {

        // A simple duration of one day
        Duration oneDay = Duration.ofDays(2);
        System.out.println(oneDay);
        System.out.println(OffsetDateTime.now().plus(oneDay));

        // Two durations combined
        System.out.println(Duration.ofHours(1).plusMinutes(45));

        // A period between two dates in years, months and days
        System.out.println(Period.between(LocalDate.of(1982, 9, 23), LocalDate.now()));

        // A period between two dates in days
        System.out.println(ChronoUnit.DAYS.between(LocalDate.of(1982, 9, 23), LocalDate.now()));

    }
}
