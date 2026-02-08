package pages;

import hooks.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class LandingPage extends DriverManager {


    @FindBy(xpath = "//input[@name='q']")
    protected WebElement searchBox;

    public LandingPage(){
        WebDriver driver = getDriver();

    }


    public void enterSearchText(String text) {
        searchBox.sendKeys(text);
    }
}
