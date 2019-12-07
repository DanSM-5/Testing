Feature: Ecentennial Login feature file

  @Ecentennial
  Scenario: Validate login credentials
    Given user launch ecentennial
    When user enters credentials
    Then user logged into the site
