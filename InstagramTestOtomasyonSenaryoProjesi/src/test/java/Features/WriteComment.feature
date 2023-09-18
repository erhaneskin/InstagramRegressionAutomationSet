Feature: Comment
  Scenario: Write comment instagram post
    Given Go to instagram
    When Enter nickname and password
    When Click the login button
    When Click the not now button
    Then Check login
    When Write a comment any instagram post
    Then Check the comment