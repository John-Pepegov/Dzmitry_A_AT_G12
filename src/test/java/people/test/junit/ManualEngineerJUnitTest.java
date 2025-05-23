package people.test.junit;

import org.junit.Before;
import org.junit.Test;
import homework.people.ManualEngineer;

import static org.junit.Assert.assertEquals;

public class ManualEngineerJUnitTest {

    private ManualEngineer engineer;

    @Before
    public void setUp() {
        engineer = new ManualEngineer(28, 5); // skill = 10
    }

    @Test
    public void testConstructorSetsAge() {
        assertEquals(28, engineer.getAge());
    }

    @Test
    public void testConstructorSetsExperience() {
        assertEquals(5 * 2, engineer.getExperience());
    }

    @Test
    public void testConstructorSetsSkill() {
        assertEquals(5 * 2, engineer.getSkill());
    }

    @Test
    public void testSetAndGetSkill() {
        engineer.setSkill(15);
        assertEquals(15, engineer.getSkill());
    }

    @Test
    public void testSetAndGetExperience() {
        engineer.setExperience(6);
        assertEquals(6, engineer.getExperience());
    }

    @Test
    public void testSetAndGetAge() {
        engineer.setAge(35);
        assertEquals(35, engineer.getAge());
    }
}
