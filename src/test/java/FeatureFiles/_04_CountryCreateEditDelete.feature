Feature: Country Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully


  Scenario: Create a country
    And Navigate to country page
    When Create a country name as "danky11" and code as "kode21"
    Then Success message should be displayed

  Scenario: Edit a country
    And Navigate to country page
    When User edit the "danky11" to "ahau66"
    Then Success message should be displayed

  Scenario: Delete a country
    And Navigate to country page
    When User delete the "ahau66"
    Then Success message should be displayed
