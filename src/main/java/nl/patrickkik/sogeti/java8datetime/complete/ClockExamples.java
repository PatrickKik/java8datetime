package nl.patrickkik.sogeti.java8datetime.complete;

import nl.patrickkik.sogeti.java8datetime.util.FastClock;

import java.time.*;

/**
 * Examples of working with the Java SE 8 Date Time API
 * <p/>
 * Many thanks to The Java(tm) Tutorials.
 *
 * @author Patrick Kik
 */
public class ClockExamples {

    public static void main(String[] args) throws InterruptedException {

        // A clock that is 45 minutes off
        System.out.println(LocalTime.now(Clock.offset(Clock.systemDefaultZone(), Duration.ofMinutes(45))));

        // A fixed clock
        OffsetDateTime offsetDateTime = OffsetDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneOffset.ofHours(-5));
        System.out.println(LocalDateTime.now(Clock.fixed(offsetDateTime.toInstant(), ZoneId.systemDefault())));

        // A custom clock
        FastClock fastClock = new FastClock();
        System.out.println(LocalTime.now(fastClock));
        Thread.sleep(1000);
        System.out.println(LocalTime.now(fastClock));
        Thread.sleep(1000);
        System.out.println(LocalTime.now(fastClock));

    }
}
