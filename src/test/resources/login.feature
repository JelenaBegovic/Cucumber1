Feature: Login

  Scenario: User can login
    Given User is on login page
    When User inputs username
    And User inputs password
    And User clicks on Login button
    Then User is logged in