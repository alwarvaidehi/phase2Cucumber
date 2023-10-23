@all
Feature: Create account on amazon
  
  Scenario: creating a account
    Given User in Amazon page
    Then enter the following data
      | Username | Email ID                | password | ReType Password |
      | Vaidehi  | vaidehi.alwar@gmail.com | vaidehi  | vaidehi         |
    
    Then user click on login button
    When User Enter the Username and password
    Then user Enter the input in search box
    And User click on the search button
    Then User click on the first option
    

    And I close browser
