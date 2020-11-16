@facebook
Feature: Post feature of facebook
  This will test the post functionality at the user wall

  Scenario: Post a text on user wall
    Given The User is logged into his facebook account
    And The user is present on his own wall
    When The user types a message in the text box
    And Clicks the post button
    Then The message should get posted


  Scenario: Post a video on user wall
    Given The User is logged into his facebook account
    And The user is present on his own wall
    When The user enters a youtube link in the text box
    And Clicks the post button
    Then The video should be posted on the user wall
    And the video should have a proper thumbnail