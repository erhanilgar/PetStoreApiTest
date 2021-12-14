package petStore.common;

import io.restassured.response.Response;
import org.junit.Assert;


public class ApiGenericFunctions {


    public static void verifyStatusCode(int expectedStatusCode, int actualStatusCode) {

        Assert.assertEquals("FAIL - Expected Status code does not match with actual!!", actualStatusCode, expectedStatusCode);
    }

    public static void verifyResponseBody(String expectedBody, String actualBody) {
        Assert.assertEquals(actualBody, expectedBody, "FAIL - Expected Body does not match with actual!!");
    }

    public static void verifyResponsePathKeyValue(String expectedKey, String expectedValue, Response response) {
        String actualValue = response.path(expectedKey).toString();

        Assert.assertEquals(actualValue, expectedValue, "FAIL - Expected path value does not match with actual ");
    }

    public static void waitForSec(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
    }
}
