
Feature: DarkSky Home Page Feature

  Background:
    Given I am on DarkSky Home page


  @homepage
  Scenario: Verify weather on DarkSky page

    When I click on search button to verify my city
    And I find the highest and lowest temperatures
    Then I verify if temp is displayed correctly

