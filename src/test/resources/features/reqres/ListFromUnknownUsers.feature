Feature: Get list user with parameter unknown user
  @Tugas
  Scenario Outline: Get list user with parameter unknown
    Given Get list user with parameter "<parameter>"
    When Send request get list user with specific parameter
    Then Status code should be 200
    And Response body page should be 1
    And Validate json schema "ListUserUnknownJsonSchema.json"
    Examples:
      | parameter |
      | unknown   |