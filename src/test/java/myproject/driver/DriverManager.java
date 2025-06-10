package myproject.driver;

import org.openqa.selenium.WebDriver;

import java.util.Optional;

public class DriverManager {

    private static WebDriver driver;

    protected static final Config config =
            Optional.ofNullable(System.getProperty("CONFIG")).isEmpty()
                    ? Config.CHROME
                    : Config.valueOf(System.getProperty("CONFIG"));

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = DriverFactory.getWebDriver(config);
        }
        return driver;
    }

    public static void destroyDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}


