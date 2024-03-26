Feature: Update user
  @Tugas
  Scenario: Update user with valid json and user id
    Given Update user with valid json "UpdateUser.json" and user id 2
    When Send request update user
    Then Status code should be 200
    And Response body page should be "Alvin" and "Student Alta"
    And Validate json schema "UpdateSuccessJsonSchema.json"

  @Tugas
  Scenario Outline: Update user with invalid json
    Given Update user with valid json "<UpdateUserInvalid>" and user id 2
    When Send request update user
    Then Status code should be 400
    And Validate json schema "UpdateUnsuccessfulJsonSchema.json"
    Examples:
      | UpdateUserInvalid       |
      | UpdateUserInvalid1.json |
      | UpdateUserInvalid2.json |
      | UpdateUserInvalid3.json |