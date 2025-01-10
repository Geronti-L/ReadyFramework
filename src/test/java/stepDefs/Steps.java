package stepDefs;

import hooks.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;


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
}

