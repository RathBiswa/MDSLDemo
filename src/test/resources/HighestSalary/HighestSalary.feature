@Test
Feature: As a user launch the form
  so that that when a particular job searched
  to find the highest salary among the employees

  @HighestSalary
  Scenario Outline: To find the highest salary of Software Engineer
    Given user is on home page
    When user navigates to table search page
    Then searches for all employees in a particular "<Role>"
    And user verifies highest salary is matching to "<ExpectedHighestSalary>"

    Examples:
      | Role              | ExpectedHighestSalary |
      | Software Engineer | 206850                |
