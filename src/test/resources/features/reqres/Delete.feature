Feature: Delete user
  @Tugas
  Scenario Outline: Delete user with valid user id
    Given Delete user with user id <id>
    When Send request delete user
    Then Status code should be 204
    Examples:
      | id |
      | 2  |
  @Tugas
  Scenario Outline: Delete user with invalid user id
    Given Delete user with invalid user id "<invalidid>"
    When Send request delete user
    Then Status code should be 400
    Examples:
      | invalidid |
      | qwerty    |
      | !@#$%     |