@Test
Feature: As a user launch the table search detail
  so that when a particular city searched
  to find the average age of all employees

  @AverageAge
  Scenario Outline: To find the average of employees of San Fransisco is 46
    Given user is on home page
    When user navigates to table search page
    Then searches for all employees in a particular "<City>"
    And user verifies average age of all employees matches to 46

    Examples:
      | City          |
      | San Francisco |