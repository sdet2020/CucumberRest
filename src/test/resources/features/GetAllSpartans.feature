@run_all
Feature: User needs to able to perform CRUD operations with spartans

  @PUT
  Scenario: Get the list of all Spartans
    Given I perform GET request for "/spartans"
    Then I should get a list of all Spartans

  @POST
  Scenario: Create 1 spartan
    Given I perform POST request for "/spartans"
    Then I should be able to add 1 spartan

  @PUT
  Scenario: PUT spartan that was created with POST request
    Given I perform PUT request for "/spartans/"
    Then I should be able to update spartan113

  @PATCH
  Scenario: PATCH spartan that was created with POST request
    Given I perform PATCH request for "/spartans/"
    Then I should be able to partially update spartan113

  @DELETE
  Scenario: DELETE spartan that was created with POST request
    Given I perform DELETE request for "/spartans/"
    Then I should be able to delete the spartan