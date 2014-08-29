package nl.patrickkik.sogeti.java8datetime.complete;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Examples of working with the Java SE 8 Date Time API
 * <p/>
 * Many thanks to The Java(tm) Tutorials.
 *
 * @author Patrick Kik
 */
public class LegacyExamples {

    public static void main(String[] args) {

        // From old Calendar to new Instant
        System.out.println(Calendar.getInstance().toInstant());

        // From new ZonedDateTime to old GregorianCalendar
        System.out.println(GregorianCalendar.from(ZonedDateTime.now()));

        // From old Date to new Instant
        System.out.println(new Date().toInstant());

        // From new Instant to old Date
        System.out.println(Date.from(ZonedDateTime.now().toInstant()));

    }
}
