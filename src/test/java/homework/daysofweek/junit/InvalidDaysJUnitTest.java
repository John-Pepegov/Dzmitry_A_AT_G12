package homework.daysofweek.junit;

import homework.daysofweek.DayOfWeekUtility;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvalidDaysJUnitTest {

    @Test
    public void testInvalidDayBelowRange() {
        assertEquals("Invalid day number. Please provide a number between 1 and 7.",
                DayOfWeekUtility.getDayOfWeek(0));
    }

    @Test
    public void testInvalidDayAboveRange() {
        assertEquals("Invalid day number. Please provide a number between 1 and 7.",
                DayOfWeekUtility.getDayOfWeek(8));
    }
}
