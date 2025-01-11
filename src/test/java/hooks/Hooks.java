package hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;



public class Hooks {

    @BeforeAll
    public static void setUp() {
        DriverManager.getDriver();
    }

    @AfterAll
    public static void tearDown() {
        DriverManager.getDriver().manage().deleteAllCookies();
        DriverManager.quitDriver();
    }
}

