package petStore.specs;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import petStore.common.ConfigurationReader;

import java.util.Collections;
import java.util.Map;

public class CommonRequestSpec {


    //in order to use Request Specification method we should write this method
    static RequestSpecification set(String uri) {

        return new RequestSpecBuilder()
                .setBaseUri(uri)
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    // Write this method for each API SERVICES
    protected static RequestSpecification petStoreRequestSpec(String uri, Object body, Map<String, Object> qParams, Map<String, Object> pathParams) {

        uri = ConfigurationReader.get("baseUri") + uri;
        return new RequestSpecBuilder()
                .addRequestSpecification(set(uri))
                .setContentType(ContentType.JSON)
                .addQueryParams(qParams = ((qParams != null) ? qParams : Collections.emptyMap()))
                .addPathParams(pathParams = ((pathParams != null) ? pathParams : Collections.emptyMap()))
                .setBody(body = ((body != null) ? body : ""))
                .build();
    }
}
