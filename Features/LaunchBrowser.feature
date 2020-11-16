Feature: Launch Browser
  This will test the post functionality at the user wall


  Scenario: Launching the Browser
    Given The launches the Chrome Browser and goes to "https://www.google.com"
    When The user enter the search term "selenium"
    And Clicks the search button
    Then Only results related to "selenium" are displayed
