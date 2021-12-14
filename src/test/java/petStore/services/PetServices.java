package petStore.services;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import petStore.common.ApiGenericFunctions;
import petStore.common.CommonRestCRUD;
import petStore.specs.PetReqSpec;

public class PetServices extends CommonRestCRUD {


    Response response;

    RequestSpecification requestSpecification;


    public Response getPetStatus(String status) {
        requestSpecification = PetReqSpec.getPetStatusReqSpec(status);

        response = get(requestSpecification, 200);

        return response;

    }


    public Response addNewPet(String id, String name) {
        requestSpecification = PetReqSpec.addNewPetReqSpec(id, name);

        response = post(requestSpecification, 200);

        return response;
    }

    public Response getPetById(String id) {
        requestSpecification = PetReqSpec.getPetIdReqSpec(id);

        response = get(requestSpecification, 200);

        return response;
    }

    public Response updatePet(String id, String updateName, String tagName) {

        requestSpecification = PetReqSpec.updatePetName(id, updateName, tagName);

        response = put(requestSpecification, 200);

        ApiGenericFunctions.waitForSec(5);

        return response;
    }

    public Response getPetByIdInvalid(String id) {
        requestSpecification = PetReqSpec.getPetIdReqSpec(id);

        response = get(requestSpecification, 404);

        return response;
    }

    public Response deleteById(String id) {
        requestSpecification = PetReqSpec.deleteById(id);

        response = delete(requestSpecification, 200);

        ApiGenericFunctions.waitForSec(5);

        return response;
    }


}
