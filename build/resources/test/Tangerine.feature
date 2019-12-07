Feature: Validate Logme in button visibility

  @Tangerine
  Scenario: Validate Logme in button visibility
    Given I launch tangerine website
    When I click logmein button
    Then I validate LogIn button is disabled
    When I add some values to textbox
    Then Logme button is enabled