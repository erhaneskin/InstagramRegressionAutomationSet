Feature: Like
  Scenario: Like instagram post
    Given Go to instagram
    When Enter nickname and password
    When Click the login button
    When Click the not now button
    Then Check login
    When Like First Post
    Then Check Like