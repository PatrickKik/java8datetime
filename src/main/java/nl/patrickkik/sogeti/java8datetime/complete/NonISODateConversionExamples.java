package nl.patrickkik.sogeti.java8datetime.complete;

import java.time.LocalDate;
import java.time.chrono.*;

/**
 * Examples of working with the Java SE 8 Date Time API
 * <p/>
 * Many thanks to The Java(tm) Tutorials.
 *
 * @author Patrick Kik
 */
public class NonISODateConversionExamples {
    public static void main(String[] args) {

        // Japanese date.
        System.out.println(JapaneseDate.now());

        // Which chronologies are available?
        System.out.println(Chronology.getAvailableChronologies());

        // Other chronologies
        System.out.println(MinguoDate.now());
        System.out.println(ThaiBuddhistDate.now());
        System.out.println(HijrahDate.now());

        // Conversion
        System.out.println(JapaneseDate.from(LocalDate.of(1982, 9, 23)));
        System.out.println(LocalDate.from(JapaneseDate.of(JapaneseEra.MEIJI, 12, 6, 23)));

    }
}
