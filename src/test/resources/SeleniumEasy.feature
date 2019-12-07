Feature: Validate Select value of dropBox and message

  @SeleniumEasy
  Scenario: Validate selected value of the dropBox
    Given I launched SeleniumEasy web page
    When I select Monday from dropDox
    Then I get the value Monday and the message Monday