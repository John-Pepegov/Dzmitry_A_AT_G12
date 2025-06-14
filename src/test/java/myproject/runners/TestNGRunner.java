package myproject.runners;

import org.testng.TestNG;

import java.util.Collections;

public class TestNGRunner {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestSuites(Collections.singletonList("src/test/resources/config/testng.xml"));
        testng.run();
    }
}
