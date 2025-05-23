package homework.daysofweek.testng;

import homework.daysofweek.DayOfWeekUtility;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DayOfWeekUtilityTestNGTest {

    @DataProvider(name = "validDaysProvider")
    public Object[][] validDays() {
        return new Object[][]{
                {1, "Monday"},
                {2, "Tuesday"},
                {3, "Wednesday"},
                {4, "Thursday"},
                {5, "Friday"},
                {6, "Saturday"},
                {7, "Sunday"}
        };
    }

    @Test(dataProvider = "validDaysProvider")
    public void testValidDays(int input, String expected) {
        assertEquals(DayOfWeekUtility.getDayOfWeek(input), expected);
    }

    @Test
    public void testInvalidDayBelowRange() {
        assertEquals(DayOfWeekUtility.getDayOfWeek(0),
                "Invalid day number. Please provide a number between 1 and 7.");
    }

    @Test
    public void testInvalidDayAboveRange() {
        assertEquals(DayOfWeekUtility.getDayOfWeek(8),
                "Invalid day number. Please provide a number between 1 and 7.");
    }
}
