Feature: Login Functionality
  @LoginTest
    Scenario Outline: Login to the App
    Given CtoK app is luanched
    When user Clicks on SignIn button
    And User Enters username "<username>"
    And User Enters password "<password>"
    And User Clicks on login button
    Then SignIn should be "<Expected_Result>"

    Examples:
    |username|password|Expected_Result|
    |mzakkar@gmail.com|test123|successful|