package homework.people.junit;

import homework.people.AutomatedEngineer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomatedEngineerJUnitTest {

    private AutomatedEngineer engineer;

    @Before
    public void setUp() {
        engineer = new AutomatedEngineer(30, 4); // skill должен быть 12
    }

    @Test
    public void testConstructorSetsAge() {
        assertEquals(30, engineer.getAge());
    }

    @Test
    public void testConstructorSetsExperience() {
        assertEquals(4 * 3, engineer.getExperience());
    }

    @Test
    public void testConstructorSetsSkill() {
        assertEquals(4 * 3, engineer.getSkill());
    }

    @Test
    public void testSetAndGetSkill() {
        engineer.setSkill(20);
        assertEquals(20, engineer.getSkill());
    }

    @Test
    public void testSetAndGetExperience() {
        engineer.setExperience(7);
        assertEquals(7, engineer.getExperience());
    }

    @Test
    public void testSetAndGetAge() {
        engineer.setAge(40);
        assertEquals(40, engineer.getAge());
    }
}
