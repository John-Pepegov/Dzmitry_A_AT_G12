package homework.people.testng;

import homework.people.AutomatedEngineer;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AutomatedEngineerTestNGTest {

    private AutomatedEngineer engineer;

    @BeforeMethod
    public void setUp() {
        engineer = new AutomatedEngineer(30, 4); // skill = 4 * 3 = 12
    }

    @Test
    public void testConstructorSetsAge() {
        assertEquals(engineer.getAge(), 30);
    }

    @Test
    public void testConstructorSetsExperience() {
        assertEquals(engineer.getExperience(), 12);
    }

    @Test
    public void testConstructorSetsSkill() {
        assertEquals(engineer.getSkill(), 12);
    }

    @Test
    public void testSetAndGetSkill() {
        engineer.setSkill(20);
        assertEquals(engineer.getSkill(), 20);
    }

    @Test
    public void testSetAndGetExperience() {
        engineer.setExperience(7);
        assertEquals(engineer.getExperience(), 7);
    }

    @Test
    public void testSetAndGetAge() {
        engineer.setAge(40);
        assertEquals(engineer.getAge(), 40);
    }
}
