Feature: Create new users

  Scenario: Create new users
    When I send a request to create user
    Then a user should be created
