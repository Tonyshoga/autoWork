@Register
Feature: Register New User

  Scenario Outline: As a new user i want to create an account
    Given I  am on the homepage
    And I Click on the log in link
    When I enter my new email address
    And I click on the crate account button
    And I click on the male radio button
    Then I enter "<firstname>"
    Then I enter a  "<lastname>" Lastname
    And I enter a  "<password>"
   And I enter date of birth
    And I enter address
    And I enter a city
    And I enter a state
    And I enter a Zip Code
    And I enter a country
    And I enter a mobile number
    When I click the register button
    Then I verify that"<user>" is logged in
    And I  sign out successfully

    Examples: 
      | firstname | lastname | password | user          |
      | miker     | teest    | testi7   | miker teest   |
      | mike      | testeer  | test1    | mike testeer  |
      | mikky     | testing  | test2    | mikky testing |
      | mite      | test     | test4    | mite test     |
