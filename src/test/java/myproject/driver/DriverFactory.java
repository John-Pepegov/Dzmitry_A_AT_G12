package myproject.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;

public class DriverFactory {

    public static WebDriver getWebDriver(Config config) {
        return switch (config) {
            case CHROME -> getChromeDriver();
            case EDGE -> getEdgeDriver();       // TODO: will be added
            case REMOTE -> getRemoteDriver();   // TODO: will be added
            default -> throw new IllegalArgumentException("Unknown config: " + config);
        };
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.addArguments("--disable-blink-features=AutomationControlled");
        return new ChromeDriver(options);
    }

    private static WebDriver getEdgeDriver() {
        // TODO: Add later
        throw new UnsupportedOperationException("Edge driver not implemented yet.");
    }

    private static WebDriver getRemoteDriver() {
        // TODO: Add later
        throw new UnsupportedOperationException("Remote driver not implemented yet.");
    }
}

