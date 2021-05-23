@wip
Feature:Idea submission on Innovation Challenge

  Background:
    Given  the user is on the login page

  Scenario: Login as an user
    Given the user enters a valid email credential
    Given the user should be able to see password screen
    Given the user enters a valid required password
    When the user clicks on Innovation Challenge card content under Running Innovation Challenges title
    When the user clicks on Submit idea button on the Innovation Challenge Page
    Then the user fills the required field and submit the idea "This is a great idea!" and "This is a description of idea"
    Then the user adds comment "This is a challenge"
    Then the user clicks on comment button
