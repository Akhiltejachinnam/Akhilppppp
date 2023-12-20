@tag
Feature: Admin Login
  I want to use this template to check admin login

  @tag1 
  Scenario: check Admin Login with valid data
    Given i open browser with url "https://app.brillius.ai/"
    Then i should see Login page
    When i enter username as "naveen"
    And i enter password as "password"
    And i click login
    Then i should see admin module
    When i click logout
    Then i should see Login page
    When i close browser
      
  Scenario Outline: check Admin Login with invalid data
    Given i open browser with url "https://app.brillius.ai/"
    Then i should see Login page
    When i enter username as "<username>"
    And i enter password as "<password>"
    And i click login
    Then i should see error message
    When i close browser
    Examples:
    |username|password|
    |naveen|xyz|
    |abc|password|
    |abc|xyz|
  