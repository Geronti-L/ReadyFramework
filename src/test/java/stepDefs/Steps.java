package stepDefs;

import hooks.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

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

    }

    @Then("user fill out the form with all required info")
    public void userFillOutTheFormWithAllRequiredInfo() {
//
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

    @Then("label for Name should be required field")
    public void labelForNameShouldBeRequiredField() {
//
            WebElement isReq=getDriver().findElement(By.xpath("//label[@class='required'][.='Name']"));
            if(isReq.isDisplayed()){
                System.out.println("Name is marked as required field");
            }else{
                System.out.println("Name is not required field");
            }

    }

    @Then("labels for Name, Username, Password and Email  are marked as required fields")
    public void labelsForNameUsernamePasswordAndEmailAreMarkedAsRequiredFields() {
        WebElement name=getDriver().findElement(By.xpath("//label[@class='required'][.='Name']"));
        WebElement userName=getDriver().findElement(By.xpath("//label[@class='required'][.='Username']"));
        WebElement password=getDriver().findElement(By.xpath("//label[@class='required'][.='Password']"));
        WebElement email=getDriver().findElement(By.xpath("//label[@class='required'][.='Email']"));
        if(name.isDisplayed()& userName.isDisplayed()& password.isDisplayed()& email.isDisplayed()){
            System.out.println("labels for name, username,passord and email are marked as required");
        }else{
            System.out.println("please check labels");
        }




    }

    @And("Confirm Password field is disabled")
    public void confirmPasswordFieldIsDisabled() {

          boolean isEnabled=getDriver().findElement(By.xpath("//input[@id='confirmPassword']")).isEnabled();

          if(!isEnabled){
              System.out.println("password confirm is disabled");

          }else{
              System.out.println("Password Confirm is enabled");
              Assertions.fail();


          }

    }
}

