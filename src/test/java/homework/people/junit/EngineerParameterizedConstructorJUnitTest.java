package homework.people.junit;

import homework.people.AutomatedEngineer;
import homework.people.Engineer;
import homework.people.ManualEngineer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EngineerParameterizedConstructorJUnitTest {

    private final Engineer engineer;
    private final int expectedAge;
    private final int expectedExperience;
    private final int expectedSkill;

    public EngineerParameterizedConstructorJUnitTest(Engineer engineer, int expectedAge, int expectedExperience, int expectedSkill) {
        this.engineer = engineer;
        this.expectedAge = expectedAge;
        this.expectedExperience = expectedExperience;
        this.expectedSkill = expectedSkill;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new AutomatedEngineer(30, 4), 30, 12, 12},
                {new ManualEngineer(28, 5), 28, 10, 10}
        });
    }

    @Test
    public void testConstructorSetsAge() {
        assertEquals("Constructor did not set correct age for " + engineer.getClass().getSimpleName(),
                expectedAge, engineer.getAge());
    }

    @Test
    public void testConstructorSetsExperience() {
        assertEquals("Constructor did not set correct experience for " + engineer.getClass().getSimpleName(),
                expectedExperience, engineer.getExperience());
    }

    @Test
    public void testConstructorSetsSkill() {
        assertEquals("Constructor did not set correct skill for " + engineer.getClass().getSimpleName(),
                expectedSkill, engineer.getSkill());
    }
}
