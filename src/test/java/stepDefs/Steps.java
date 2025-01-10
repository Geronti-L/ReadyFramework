package stepDefs;

import hooks.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {

        @Given("user navigates to Google")
        public void userNavigatesToGoogle() {
            DriverManager.getDriver().get("https://www.google.com");
            System.out.println("Navigated to Google");
        }

        @Then("user checks the page title")
        public void userChecksThePageTitle() {
            String title = DriverManager.getDriver().getTitle();
            System.out.println("Page title: " + title);
        }
    }

