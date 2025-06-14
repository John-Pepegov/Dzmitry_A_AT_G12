package myproject.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import myproject.driver.DriverManager;

public class BaseSteps {

    @Before
    public void initDriver() {
        DriverManager.getDriver();
    }

    @After
    public void closeDriver() {
        DriverManager.destroyDriver();
    }
}
