package com.spartan.functions.put;

import com.spartan.functions.SpartanPayload;
import com.spartan.functions.post.Create1Spartan;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PutSpartan {

    SpartanPayload spartanPayload = new SpartanPayload();
    int actualStatusCodeAfterSendingPostRequest;
    static int idOfNewlyCreatedSpartan = Create1Spartan.idOfNewlyCreatedSpartan;

    public void putSpartan(String endPoint){
        Response response =
                given()
                        .baseUri("http://54.211.84.13:8000")
                        .basePath("/api")
                        .contentType(ContentType.JSON)
                        .body(spartanPayload.spartanPayload())
                        .log().all().
                when()
                        .put(endPoint+idOfNewlyCreatedSpartan).
                then()
                        .log().all().extract().response();
        actualStatusCodeAfterSendingPostRequest = response.getStatusCode();
    }

    public int getActualStatusCode(){
        return actualStatusCodeAfterSendingPostRequest;
    }
}
