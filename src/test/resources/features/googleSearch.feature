
  Feature: Passing multiple parameters to step
    @googleMultiple
    Scenario: User searches for multiple items
      Given User is on Google home page
      Then User searches for the following
            |java|
            |test automation|
            |cucumber bdd|
            |selenium|
            |canadian toque|