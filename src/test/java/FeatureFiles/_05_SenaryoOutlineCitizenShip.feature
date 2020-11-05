Feature: Citizenship with senaryooutline

  Background:
    Given Navigate to automationpractice
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Contac us page


  Scenario Outline: Citizenship create and delete with senaryo outline

    When User Create a Citizenship name as "<CitizenshipName>" short name as "<CitizenshipShortName>"
    Then Success message should be displayed

    When User Create a Citizenship name as "<CitizenshipName>" short name as "<CitizenshipShortName>"
    Then Error message should be displayed
    And Click on close button

    Then User delete the "<CitizenshipName>"
    Then Success message should be displayed


    Examples:
      | CitizenshipName | CitizenshipShortName |
      | zlmky12           | tkp1               |
      | zlmky22         | tkp2                 |
      | zlmky32           | tkp3               |

