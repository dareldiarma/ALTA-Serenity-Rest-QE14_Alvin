Feature: Create user
  @Tugas
  Scenario: Post create user with valid json
    Given Create user with valid json "CreateUser.json"
    When Send request create new user
    Then Status code should be 201
    And Response body page should be "Alvin" and "Student Alta"
    And Validate json schema "CreateUserSuccessJsonSchema.json"
  @Tugas
  Scenario Outline: Post create user with invalid json
    Given Create user with invalid json "<json>"
    When Send request create new user
    Then Status code should be 400
    And Validate json schema "ListUsersJsonSchema.json"
    Examples:
      | json                        |
      | CreateUserInvalidJson1.json |
      | CreateUserInvalidJson2.json |
      | CreateUserInvalidJson3.json |