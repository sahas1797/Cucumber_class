Feature: Login Functionality
  Scenario Outline: Checking the login with correct credentials
    Given The user will be on the login page
    When the user enters <uname> and <pwd>
    And clicks on Login button
    Then the user must redirect to his homepage

    Examples:
    |uname|pwd|
    |sahasinnovapath|Innovapath|
    |Vinay          |Vinay123  |


