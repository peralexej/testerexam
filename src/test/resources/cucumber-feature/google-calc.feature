Feature: Google Calculator
#  Calculator should calculate correct calculations

  Scenario: Add numbers
    Given Open "https://www.google.ie/search?q=calculator" page
    When Number 1 plus 2
    Then Result equal to "3"

  Scenario: Check that chrome doesnt close after the scenario
    Given Open "https://www.google.ie/search?q=calculator" page