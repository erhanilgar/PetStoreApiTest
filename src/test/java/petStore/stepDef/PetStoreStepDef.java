package petStore.stepDef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import petStore.common.ApiGenericFunctions;
import petStore.services.PetServices;

public class PetStoreStepDef {

    Response response;

    PetServices petServices = new PetServices();


    @Given("Send Get request for status {string}")
    public void sendGetRequestForStatus(String status) {
        response = petServices.getPetStatus(status);
    }

    @Then("Verify that status code is {int}")
    public void verifyThatStatusCodeIs(int expectedStatus) {
        ApiGenericFunctions.verifyStatusCode(expectedStatus, response.getStatusCode());
    }

    @Given("create Post request to add a new pet with {string} and {string} to the store")
    public void createPostRequestToAddANewPetWithAndToTheStore(String id, String name) {
        response = petServices.addNewPet(id, name);
    }


    @When("Send get request by {string}")
    public void sendGetRequestBy(String id) {

        response = petServices.getPetById(id);
    }


    @Given("they can update the pet {string}information using the PUT request with new name {string} and {string} to verify the updated information in response")
    public void theyCanUpdateThePetInformationUsingThePUTRequestWithNewNameAndToVerifyTheUpdatedInformationInResponse(String id, String updateName, String tagName) {

        response = petServices.updatePet(id, updateName, tagName);
    }

    @Given("User can delete the pet {string} using DELETE request")
    public void userCanDeleteThePetUsingDELETERequest(String id) {

        response = petServices.deleteById(id);
    }

    @When("Send get request by  invalid {string}")
    public void sendGetRequestByInvalid(String invalidId) {

        response = petServices.getPetByIdInvalid(invalidId);
    }
}
