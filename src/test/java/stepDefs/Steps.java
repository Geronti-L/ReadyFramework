package stepDefs;

import hooks.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static hooks.DriverManager.getDriver;

public class Steps {

        @Given("user navigates to Google")
        public void userNavigatesToGoogle() {
            getDriver().get("https://www.google.com");
            System.out.println("Navigated to Google");
        }

        @Then("user checks the page title")
        public void userChecksThePageTitle() {
            String title = getDriver().getTitle();
            System.out.println("Page title: " + title);
        }

    @Given("user navigates to {string}")
    public void userNavigatesTo(String url) {
            getDriver().get("https://"+url);
    }

    @Then("user checks the page title is {string}")
    public void userChecksThePageTitleIs(String title) {
          String actualTitle =  getDriver().getTitle().toString();
          Assertions.assertEquals(title,actualTitle);
          String source=getDriver().getPageSource();
          System.out.println(source.length());
        if (actualTitle.equals(title)){
            System.out.println("Verification Successful - The correct Url is opened.");
        }
        else {
            System.out.println("Verification Failed - An incorrect Url is opened.");

            //In case of Fail, you like to print the actual and expected URL for the record purpose
            System.out.println("Actual URL is : " + actualTitle);
            System.out.println("Expected URL is : " + title);
        }

    }

    @Then("user fill out the form with all required info")
    public void userFillOutTheFormWithAllRequiredInfo() {
           getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            getDriver().findElement(By.xpath("//input[@id='name']")).click();
            getDriver().findElement(By.xpath("//input[@id='firstName']")).sendKeys("john");
            getDriver().findElement(By.xpath("//input[@id='lastName']")).sendKeys("doe");
            getDriver().findElement(By.xpath("//span[contains(text(),'Save')]")).click();
            getDriver().findElement(By.xpath("//input[@ng-model='formData.username']")).sendKeys("username");
            getDriver().findElement(By.xpath("//input[@ng-model='formData.password']")).sendKeys("userPassword");
            getDriver().findElement(By.xpath("//input[@ng-model='formData.confirmPassword']")).sendKeys("userPassword");
            getDriver().findElement(By.xpath("//input[@ng-model='formData.email']")).sendKeys("user@test.com");
            getDriver().findElement(By.xpath("//input[@ng-model='formData.phone']")).sendKeys("123456789");
            getDriver().findElement(By.xpath("//input[@ng-model='formData.gender']")).click();
            getDriver().findElement(By.xpath("//input[@ng-model='formData.dateOfBirth']")).click();
            getDriver().findElement(By.xpath("//option[contains(text(),'Dec')]")).click();
            getDriver().findElement(By.xpath("//option[contains(text(),'1983')]")).click();
            getDriver().findElement(By.xpath("//a[normalize-space()='3']")).click();
            getDriver().findElement(By.xpath("//input[@ng-model='formData.agreedToPrivacyPolicy']")).click();
            getDriver().findElement(By.xpath("//select[@name='countryOfOrigin']")).click();
            getDriver().findElement(By.xpath("//option[contains(text(),'Germany')]")).click();
            getDriver().findElement(By.xpath("//button[@id='formSubmit']")).click();

    }

    @Then("user waits {int} seconds")
    public void userWaitsSeconds(int sec) throws InterruptedException {
            Thread.sleep(sec*1000);


    }
}

