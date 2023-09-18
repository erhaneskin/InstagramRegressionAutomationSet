Feature: Login
  Scenario: Login to instagram
    Given Go to instagram
    When Enter nickname and password
    When Click the login button
    When Click the not now button
    Then Check login
