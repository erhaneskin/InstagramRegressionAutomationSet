Feature: Share
  Scenario: Share a comment instagram post
    Given Go to instagram
    When Enter nickname and password
    When Click the login button
    When Click the not now button
    Then Check login
    When Share a post any instagram follower
    Then Check the post