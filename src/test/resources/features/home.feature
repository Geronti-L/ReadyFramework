Feature: Google Search

  Scenario: Open Google and verify title
    Given user navigates to Google
    Then user checks the page title


    Scenario: Open a page and verify title
      Given user navigates to "skryabin.com/webdriver/html/basic_form.html"
      Then user checks the page title is "Basic form"