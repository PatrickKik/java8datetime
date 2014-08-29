package nl.patrickkik.sogeti.java8datetime.util;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Examples of working with the Java SE 8 Date Time API
 * <p/>
 * Many thanks to The Java(tm) Tutorials.
 * <p/>
 * A clock that runs twice as fast. This is far to simple implementation of a Clock!
 *
 * @author Patrick Kik
 */
public class FastClock extends Clock {

    /**
     * Starting point of the fast clock.
     */
    private ZonedDateTime begin;


    /**
     * Creates a new fast clock. It will use 'now' as the starting point.
     */
    public FastClock() {
        begin = ZonedDateTime.now();
    }


    @Override
    public ZoneId getZone() {
        return ZoneId.systemDefault();
    }


    @Override
    public Clock withZone(ZoneId zone) {
        return null;
    }


    @Override
    public Instant instant() {
        // Gets 'now'.
        ZonedDateTime now = ZonedDateTime.now();
        long nowSeconds = now.toInstant().getEpochSecond();
        long beginSeconds = begin.toInstant().getEpochSecond();
        // Difference between the starting point of this clock and 'now'.
        long delta = nowSeconds - beginSeconds;
        // Creates a datetime that is in the future.
        return begin.plusSeconds(delta * 2).toInstant();
    }

}
