package com.spartan.functions.post;

import com.spartan.functions.SpartanPayload;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Create1Spartan {

    SpartanPayload spartanPayload = new SpartanPayload();
    int actualStatusCodeAfterSendingPostRequest;
    public static int idOfNewlyCreatedSpartan;

    public void create1spartan(String endPoint){
        Response response =
        given()
                .baseUri("http://54.211.84.13:8000")
                .basePath("/api")
                .contentType(ContentType.JSON)
                .body(spartanPayload.spartanPayload()).
        when()
                .post(endPoint).
        then()
                .log().all()
                .extract().response();

        actualStatusCodeAfterSendingPostRequest = response.getStatusCode();

        JsonPath jsonPath = response.jsonPath();
        idOfNewlyCreatedSpartan = jsonPath.get("data.id");

    }

    public int getActualStatusCode(){
        return actualStatusCodeAfterSendingPostRequest;
    }


}
