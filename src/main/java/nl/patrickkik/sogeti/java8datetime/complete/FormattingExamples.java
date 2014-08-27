package nl.patrickkik.sogeti.java8datetime.complete;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Examples of working with the Java SE 8 Date Time API
 * <p/>
 * Many thanks to The Java(tm) Tutorials.
 *
 * @author Patrick Kik
 */
public class FormattingExamples {

    public static void main(String[] args) {

        // Parsing a simple date/time
        System.out.println(LocalDate.parse("2014-09-04"));

        // Parsing a complex date/time
        System.out.println(LocalDateTime.parse("2014-08-27T20:22:15.54", DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // Parsing a custom date/time
        System.out.println(LocalDate.parse("avril 12, 2003", DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.FRENCH)));

        // Formatting with a default formatter
        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_WEEK_DATE));

        // Formatting with a custom formatter
        System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ofPattern("d (EEEE) MMM ''yy - a h:m:s.S zzz, G")));

    }
}
