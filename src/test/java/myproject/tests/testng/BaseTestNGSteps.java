package myproject.tests.testng;

import myproject.driver.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestNGSteps {

    @BeforeClass
    public void setUp() {
        DriverManager.getDriver();
    }

    @AfterClass
    public void tearDown() {
        DriverManager.destroyDriver();
    }
}