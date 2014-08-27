package nl.patrickkik.sogeti.java8datetime.complete;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Times {

    public static void main(String[] args) {

        // What time is it now?
        LocalTime localNow = LocalTime.now();
        System.out.println(localNow);
        System.out.println(localNow.truncatedTo(ChronoUnit.MINUTES));

        // With offset
        OffsetTime offsetNow = OffsetTime.now();
        System.out.println(offsetNow);
        System.out.println(OffsetTime.of(localNow, ZoneOffset.ofHours(-6)));
        System.out.println(offsetNow.withOffsetSameInstant(ZoneOffset.ofHours(-6)));
        System.out.println(offsetNow.withOffsetSameLocal(ZoneOffset.ofHours(-6)));

        // With date
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().plus(Duration.ofHours(1000)));

        // With date and zone
        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/New_York")));

        // Instant
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(LocalDateTime.from(instant));
        System.out.println(ZonedDateTime.ofInstant(instant, ZoneId.of("America/New_York")));

    }
}
