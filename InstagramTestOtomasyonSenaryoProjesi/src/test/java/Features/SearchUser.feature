Feature: Login
  Scenario: Login to instagram
    Given Go to instagram
    When Enter nickname and password
    When Click the login button
    When Click the not now button
    Then Check login
    When Click on the search button
    When Search user
    When Click on the user
    Then Check the user