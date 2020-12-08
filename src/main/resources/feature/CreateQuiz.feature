Feature: Login functionality with Background

  Background: user login to CK
  Given CtoK app is luanched
  And User Enters Credentials to LogIn
  |UserName|Password|
  |mzakkar@gmail.com|test123|
  Then user verify title of the page


  @QuizTest
  Scenario Outline: Create new quiz
    Given user is Logged in
    When user Clicks on Library Link
    And User clicks on Create New Dropdown
    And User Selects Quiz
    Then User Enter Title as "<QuizTitle>"

    Examples:
|QuizTitle|
|Auto Quiz|
