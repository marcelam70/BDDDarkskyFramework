# new feature
# Tags: optional

Feature: Dark Sky Login Page

  @loginpage
  Scenario: I am on darksky login page
    Given Given I am on the darksky Register page
    When I enter marcela@gmail.com into email text fields on login page
    And I enter password1 into password text fields on login page
    And I click on login button
    Then I verify error message “Username and password do not match”