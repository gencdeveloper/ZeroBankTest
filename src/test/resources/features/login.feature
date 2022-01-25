Feature:Online Banking Login Feature
  Agile Story: Only authorized users should be able login


  @smoke
  Scenario: Authorized users should be able to login
    Given the user is on the login page
    And User logins with username "username" and password "password"
    Then the "Account Summary" page should be displayed

