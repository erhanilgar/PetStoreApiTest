package petStore.specs;

import groovyjarjarantlr4.v4.codegen.model.SrcOp;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import petStore.common.ConfigurationReader;
import petStore.dataFactory.DataFactory_PetStore;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PetReqSpec extends CommonRequestSpec {


    public static RequestSpecification getPetStatusReqSpec(String status) {
        Map<String, Object> qParams = new HashMap<>();
        qParams.put("status", status);
        return petStoreRequestSpec(ConfigurationReader.get("getStatusEndPoint"), null, qParams, null);

    }


    public static RequestSpecification addNewPetReqSpec(String id, String name) {

        return petStoreRequestSpec(ConfigurationReader.get("addNewPetEndPoint"), DataFactory_PetStore.addNewPetBody(id, name), null, null);
    }

    public static RequestSpecification getPetIdReqSpec(String id) {

        return petStoreRequestSpec(ConfigurationReader.get("getPetByIdEndPoint").concat(id), null, null, null);
    }

    public static RequestSpecification updatePetName(String id, String updateName, String tagName) {

        return petStoreRequestSpec(ConfigurationReader.get("updateNameEndPoint"), DataFactory_PetStore.upDateName(id, updateName, tagName), null, null);
    }

    public static RequestSpecification deleteById(String id) {
        return petStoreRequestSpec(ConfigurationReader.get("deleteByIdEndPoint").concat(id), null, null, null);
    }


}
