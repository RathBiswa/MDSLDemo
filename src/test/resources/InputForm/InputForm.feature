@Test
Feature: As a user launch the form
  so that input details can be entered
  to submit the form successfully

  @InputForm
  Scenario Outline: To complete the input form and submit
    Given user is on home page
    When user navigates to input form
    Then input form details should be displayed
    And user enters the first name as "<FirstName>"
    And user enters the last name as "<LastName>"
    And user enters the email as "<EmailId>"
    And user enters the phone number as "<Phone>"
    And user enters the address as "<Address>"
    And user enters the city as "<City>"
    And user selects the state as "<State>"
    And user enters the Zip code as "<Zip>"
    And user enters the website as "<Website>"
    And user chooses the hosting option as Yes
    And user enters the project description as "<Description>"
    And user submits the form

    Examples:
      | FirstName | LastName | EmailId              | Phone      | Address | City   | State | Zip     | Website      | Description  |
      | John      | Smith    | John.smith@email.com | 0123456789 | Redhill | Rdhill | Texas | Redhill | www.test.com | Best Project |