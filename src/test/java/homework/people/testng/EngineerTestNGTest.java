package homework.people.testng;

import homework.people.AutomatedEngineer;
import homework.people.Engineer;
import homework.people.ManualEngineer;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EngineerTestNGTest {

    @DataProvider(name = "constructorData")
    public Object[][] constructorData() {
        return new Object[][]{
                {new AutomatedEngineer(30, 4), 30, 12, 12}, // 4 * 3 = 12
                {new ManualEngineer(28, 5), 28, 10, 10}     // 5 * 2 = 10
        };
    }

    @Test(dataProvider = "constructorData")
    public void testConstructorSetsAge(Engineer engineer, int expectedAge, int expectedExperience, int expectedSkill) {
        assertEquals(engineer.getAge(), expectedAge);
    }

    @Test(dataProvider = "constructorData")
    public void testConstructorSetsExperience(Engineer engineer, int expectedAge, int expectedExperience, int expectedSkill) {
        assertEquals(engineer.getExperience(), expectedExperience);
    }

    @Test(dataProvider = "constructorData")
    public void testConstructorSetsSkill(Engineer engineer, int expectedAge, int expectedExperience, int expectedSkill) {
        assertEquals(engineer.getSkill(), expectedSkill);
    }

    @DataProvider(name = "setterData")
    public Object[][] setterData() {
        return new Object[][]{
                {new AutomatedEngineer(25, 3)},
                {new ManualEngineer(27, 4)}
        };
    }

    @Test(dataProvider = "setterData")
    public void testSetAndGetSkill(Engineer engineer) {
        engineer.setSkill(42);
        assertEquals(engineer.getSkill(), 42);
    }

    @Test(dataProvider = "setterData")
    public void testSetAndGetExperience(Engineer engineer) {
        engineer.setExperience(88);
        assertEquals(engineer.getExperience(), 88);
    }

    @Test(dataProvider = "setterData")
    public void testSetAndGetAge(Engineer engineer) {
        engineer.setAge(55);
        assertEquals(engineer.getAge(), 55);
    }
}
