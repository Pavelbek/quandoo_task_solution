@tables
Feature: Tables sorting functionality
  As a user I want to sort Example 2 table in ascending/descending
  To do this I click on Last Name header

  Background:
    Given I am on Tables page

  Scenario: Order table by Last Name and check order is correct
    When I check initial Last Name column order
    And I click Last Name header
    Then Table is sorted in ascending order
    When I click Last Name header
    Then Table is sorted in descending order