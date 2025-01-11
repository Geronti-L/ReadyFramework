@Alltests
Feature: Google Search
 @GoogleSearch
  Scenario: Open Google and verify title
    Given user navigates to Google
    Then user checks the page title

    @UserWeb
    Scenario: Open a page and verify title
      Given user navigates to "skryabin.com/webdriver/html/basic_form.html"
      Then user checks the page title is "Basic form"


@formfillout
  Scenario: Fill out the form
    Given user navigates to "skryabin.com/webdriver/html/quote.html"
    Then user fill out the form with all required info
    Then user waits 3 seconds


