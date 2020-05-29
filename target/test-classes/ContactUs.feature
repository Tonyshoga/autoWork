
@ContactUs
Feature: Contact us Test

 
  Scenario: As a user i want to be able to contact customer service
    Given I  am on the homepage
    And I click on the contact us link
    When I select the drop down
    And Enter an email address
    And Enter an order number
    And I send a message in message box
    And I upload an attachment
    Then I click on submit

  
