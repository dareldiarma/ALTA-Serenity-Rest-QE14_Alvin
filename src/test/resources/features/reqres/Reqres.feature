Feature: Serenity Rest QE 14
  @Latihan
  Scenario Outline: Get list user with valid parameter page
    Given Get list user with parameter page <page>
    When Send request get list users
    Then Status code should be 200
    And Response body page should be <page>
    And Validate json schema "ListUsersJsonSchema.json"
    Examples:
      | page |
      | 1    |
      | 2    |

    @Latihan
    Scenario: post create user with valid json
      Given Create user with valid json "CreateUser.json"
      When Send request create new user
      Then Status code should be 201
      And Response body page should be "morpheus" and "leader"

    @Latihan
    Scenario: Update user with valid json and user id
      Given Update user with valid json "UpdateUser.json" and user id 2
      When Send request update user
      Then Status code should be 200

    @Latihan
    Scenario: Delete user with valid user id
      Given Delete user with user id 2
      When Send request delete user
      Then Status code should be 204