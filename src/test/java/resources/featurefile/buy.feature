Feature: Search functionality

  @sanity
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click "Search Cars" link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on find my next car tab
    Then I should see the make "<make>" in results

    Examples:
      | make       | model  | location            | price   |
      | Audi       | A4     | VIC - Melbourne     | $2,500  |
      | Honda      | Accord | WA - All            | $10,000 |
      | Mitsubishi | Lancer | NSW - Riverina      | $5,000  |
      | Mini       | Cooper | QLD - Central Coast | $3,000  |
      | Maserati   | 3200   | SA - South          | $2,000  |
      | Ford       | Fiesta | VIC - All           | $2,000  |

  @smoke
 Scenario Outline: Search the used cars with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click on "Used" car link
    Then I navigate to 'used cars for sale' page
    And I select make "<make>" in used car
    And I select model "<model>" in used car
    And I select location "<location>" in used car
    And I select price "<price>"in used car
    And I click on find my next car tab
    Then I should see the make "<make>" in results
    Examples:
      | make       | model  | location            | price   |
      | Audi       | A4     | VIC - Melbourne     | $2,500  |
      | Honda      | Accord | WA - All            | $10,000 |
      | Mitsubishi | Lancer | NSW - Riverina      | $5,000  |
      | Mini       | Cooper | QLD - Central Coast | $3,000  |
      | Maserati   | 3200   | SA - South          | $2,000  |
      | Ford       | Fiesta | VIC - All           | $2,000  |




