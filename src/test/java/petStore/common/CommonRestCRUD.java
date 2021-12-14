package petStore.common;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class CommonRestCRUD {

    // All methods should be STATIC and return type should be RESPONSE!!

    public static Response get(RequestSpecification requestSpecification, int expectedResponseCode) {
        return given().spec(requestSpecification)
                .when().log().all()
                .get()
                .then()
                .statusCode(expectedResponseCode)
                .extract().response();
    }

    public static Response post(RequestSpecification requestSpecification, int expectedResponseCode) {
        return given().spec(requestSpecification)
                .when().log().all()
                .post()
                .then()
                .statusCode(expectedResponseCode)
                .extract().response();
    }

    public static Response patch(RequestSpecification requestSpecification, int expectedResponseCode) {
        return given().spec(requestSpecification)
                .when().log().all()
                .patch()
                .then()
                .statusCode(expectedResponseCode)
                .extract().response();
    }

    public static Response put(RequestSpecification requestSpecification, int expectedResponseCode) {
        return given().spec(requestSpecification)
                .when().log().all()
                .put()
                .then()
                .statusCode(expectedResponseCode)
                .extract().response();
    }

    public static Response delete(RequestSpecification requestSpecification, int expectedResponseCode) {
        return given().spec(requestSpecification)
                .when().log().all()
                .delete()
                .then()
                .statusCode(expectedResponseCode)
                .extract().response();
    }

}
