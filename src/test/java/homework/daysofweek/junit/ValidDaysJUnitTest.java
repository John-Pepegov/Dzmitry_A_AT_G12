package homework.daysofweek.junit;

import homework.daysofweek.DayOfWeekUtility;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ValidDaysJUnitTest {
    private final int input;
    private final String expected;

    public ValidDaysJUnitTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Проверка дня {0}: ожидаем {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "Monday"},
                {2, "Tuesday"},
                {3, "Wednesday"},
                {4, "Thursday"},
                {5, "Friday"},
                {6, "Saturday"},
                {7, "Sunday"}
        });
    }

    @Test
    public void testValidDays() {
        assertEquals(expected, DayOfWeekUtility.getDayOfWeek(input));
    }
}
