Feature: Register
  @Tugas
  Scenario: Register with valid email and password
    Given User register with valid email and password entered with json "RegisterEmailPassword.json"
    When Send request to register
    Then Status code should be 200
    And Validate json schema "RegisterSuccessful.json"
  @Tugas
#    Negative test case
  Scenario Outline: Register with invalid email and password
    Given User register with invalid email and password entered with json "<WrongRegisterEmailPassword.json>"
    When Send request to register
    Then Status code should be 400
    And Validate json schema "RegisterUnsuccessful.json"
    Examples:
      | WrongRegisterEmailPassword.json  |
      | WrongRegisterEmailPassword1.json |
      | WrongRegisterEmailPassword2.json |
      | WrongRegisterEmailPassword3.json |
      | WrongRegisterEmailPassword4.json                           |