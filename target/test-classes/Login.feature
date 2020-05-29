@Login
Feature: Login Test

  Scenario Outline: As a use I want to check if i can login successfully
    Given I  am on the homepage
    And I Click on the log in link
    And I enter email "<email>"address
    And I enter password "<password>"
    When I click on the login  in button
    Then I verify that "<user>"  logged in successfully
    And I sign out successfuly

    Examples: 
      | email            | password | user          |
      | tony167@test.com | testi7   | miker teest   |
      | tony195@test.com | test1    | mike testeer  |
      | tony133@test.com | test2    | mikky testing |
