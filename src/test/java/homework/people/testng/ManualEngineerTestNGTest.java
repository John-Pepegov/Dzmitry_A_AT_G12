package homework.people.testng;

import homework.people.ManualEngineer;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ManualEngineerTestNGTest {

    private ManualEngineer engineer;

    @BeforeMethod
    public void setUp() {
        engineer = new ManualEngineer(28, 5); // skill = 5 * 2 = 10
    }

    @Test
    public void testConstructorSetsAge() {
        assertEquals(engineer.getAge(), 28);
    }

    @Test
    public void testConstructorSetsExperience() {
        assertEquals(engineer.getExperience(), 10);
    }

    @Test
    public void testConstructorSetsSkill() {
        assertEquals(engineer.getSkill(), 10);
    }

    @Test
    public void testSetAndGetSkill() {
        engineer.setSkill(17);
        assertEquals(engineer.getSkill(), 17);
    }

    @Test
    public void testSetAndGetExperience() {
        engineer.setExperience(9);
        assertEquals(engineer.getExperience(), 9);
    }

    @Test
    public void testSetAndGetAge() {
        engineer.setAge(33);
        assertEquals(engineer.getAge(), 33);
    }
}
