Feature: Update user
  @Tugas
  Scenario: Update user with valid json and user id
    Given Update user with valid json "UpdateUser.json" and user id 2
    When Send request update user
    Then Status code should be 200
    And Response body page should be "Alvin" and "Student Alta"
    And Validate json schema "UpdateSuccessJsonSchema.json"