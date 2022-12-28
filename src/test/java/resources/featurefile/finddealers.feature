Feature: Find the dealer and verify
  As a user i want to find dealer

  @Regression
  Scenario Outline: Find the dealer and verify the dealers are in list
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click "Find a Dealer"
    Then I navigate to 'car dealer page'
    And I should see the dealer names "<dealersName>" are display on page
    Examples:
      | dealersName                |
      | 3 Point Motors Epping      |
      | 4WD & Commercial Centre    |
      | 5 Star Auto Trade          |
      | A & M Car Sales Pty Ltd    |
      | A1 Motors Company New Town |
      | ANDREA MOTORI SERVICE      |





