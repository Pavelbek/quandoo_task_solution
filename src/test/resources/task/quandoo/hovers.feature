@hovers
Feature: Hover Functionality
  In order to see the username
  User need to hover avatar

  Background:
    Given I am on Hovers page

  Scenario Outline: Check correct username is displayed when hover avatar
    When I hover <avatar_num> avatar
    Then I can see user <username>

  Examples:

  | avatar_num | username |
  | 1          | user1    |
  | 2          | user2    |
  | 3          | user3    |