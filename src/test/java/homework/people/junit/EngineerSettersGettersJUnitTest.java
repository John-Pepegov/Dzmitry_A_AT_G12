package homework.people.junit;

import homework.people.AutomatedEngineer;
import homework.people.Engineer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineerSettersGettersJUnitTest {

    @Test
    public void testSetAndGetSkill() {
        Engineer engineer = new AutomatedEngineer(25, 3);
        engineer.setSkill(42);
        assertEquals(42, engineer.getSkill());
    }

    @Test
    public void testSetAndGetExperience() {
        Engineer engineer = new AutomatedEngineer(25, 3);
        engineer.setExperience(99);
        assertEquals(99, engineer.getExperience());
    }

    @Test
    public void testSetAndGetAge() {
        Engineer engineer = new AutomatedEngineer(25, 3);
        engineer.setAge(77);
        assertEquals(77, engineer.getAge());
    }
}
