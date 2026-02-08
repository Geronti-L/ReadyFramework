@Alltests
Feature: Google Search

#  Background: Navigate to the Home Page
#    Given user navigates to "skryabin.com/webdriver/html/quote.html"


# @Google
#  Scenario: Open Google and verify title
#    Given user navigates to Google
#    Then user checks the page title
#helloGitlab
    @UserWeb
    Scenario: Open a page and verify title
      Given user navigates to "skryabin.com/webdriver/html/basic_form.html"
      Then user checks the page title is "Basic form"




  @formfillout
  Scenario: Fill out the form
    Given user navigates to "skryabin.com/webdriver/html/quote.html"
    Then user fills out the form with all required info
    Then user waits 3 seconds


  @verify
  Scenario: Verify field values
    Given user navigates to "skryabin.com/webdriver/html/quote.html"
    Then labels for Name, Username, Password and Email  are marked as required fields
    And Confirm Password field is disabled




