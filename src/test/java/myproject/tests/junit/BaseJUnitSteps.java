package myproject.tests.junit;

import myproject.driver.DriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseJUnitSteps {

    @BeforeClass
    public static void initDriver() {
        DriverManager.getDriver();
    }

    @AfterClass
    public static void closeDriver() {
        DriverManager.destroyDriver();
    }
}
