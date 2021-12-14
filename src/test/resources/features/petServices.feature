@smoke
Feature: Pet store -  Get , Put (add/create) Update and Delete

@getPet
  Scenario: Get Request
    Given Send Get request for status "available"
    Then Verify that status code is 200

@addPet
  Scenario Outline: Verify that as a user I can able to add new pet
    Given create Post request to add a new pet with "<id>" and "<petName>" to the store
    Then Verify that status code is 200
    When Send get request by "<id>"
    Then Verify that status code is 200

    Examples:
      | id  | petName |
      | 101 | Zeus    |
      | 102 | Toby    |

@updatePet
  Scenario Outline: Verify that, as a user I can able to Update pet name and and Tag Name
    Given they can update the pet "<id>"information using the PUT request with new name "<updatePetName>" and "<tagName>" to verify the updated information in response
    Then Verify that status code is 200
    When Send get request by "<id>"
    Then Verify that status code is 200


    Examples:
      | id  | updatePetName | tagName |
      | 101 | Leo           | owner   |
      | 102 | Zeus         | owner   |

  @deletePet
  Scenario Outline: Verify that as a user I can able to Delete the existing pet
    Given User can delete the pet "<id>" using DELETE request
    Then Verify that status code is 200
    When Send get request by  invalid "<id>"
    Then Verify that status code is 404
    Examples:
      | id  |
      | 101 |
      | 102 |
