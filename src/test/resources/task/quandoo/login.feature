@login
Feature: Login Functionality
  As an existing user
  I want to login to the secret area

  Background:
    Given I am on Login page

  Scenario Outline: Login with correct and incorrect credentials
    When I login with <credentials>
    Then I see <expected_message>

    Examples:
      | credentials         | expected_message            |
      | correct.credentials | successful.login.message    |
      | incorrect.password  | password.validation.message |
      | incorrect.username  | username.validation.message |
