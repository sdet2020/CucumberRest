package com.spartan.functions.delete;

import com.spartan.functions.SpartanPayload;
import com.spartan.functions.post.Create1Spartan;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DeleteSpartan {
    static int idOfNewlyCreatedSpartan = Create1Spartan.idOfNewlyCreatedSpartan;
    int actualStatusCodeAfterSendingPostRequest;


    public void deleteSpartan(String endPoint){
        Response response =
                given()
                        .baseUri("http://54.211.84.13:8000")
                        .basePath("/api").
                when()
                        .delete(endPoint+idOfNewlyCreatedSpartan);
        actualStatusCodeAfterSendingPostRequest = response.getStatusCode();
    }

    public int getActualStatusCode(){
        return actualStatusCodeAfterSendingPostRequest;
    }
}
