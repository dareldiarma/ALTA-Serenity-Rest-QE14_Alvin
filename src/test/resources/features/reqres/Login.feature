Feature: Login
  @Tugas
#  Positive test case
  Scenario: Login with valid email and password
    Given User login with valid email and password entered with json "EmailPassword.json"
    When Send request to login
    Then Status code should be 200
    And Validate json schema "LoginSuccessful.json"

  @Tugas
#    Negative test case
  Scenario Outline: Login with invalid email and password
    Given User login with invalid email and password entered with json "<WrongEmailPassword.json>"
    When Send request to login
    Then Status code should be 400
    And Validate json schema "LoginUnsuccessful.json"
    Examples:
      | WrongEmailPassword.json  |
      | WrongEmailPassword1.json |
      | WrongEmailPassword2.json |
      | WrongEmailPassword3.json |
      | WrongEmailPassword4.json |