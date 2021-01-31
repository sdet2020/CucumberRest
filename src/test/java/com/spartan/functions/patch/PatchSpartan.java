package com.spartan.functions.patch;

import com.spartan.functions.SpartanPayload;
import com.spartan.functions.post.Create1Spartan;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PatchSpartan {

    static int idOfNewlyCreatedSpartan = Create1Spartan.idOfNewlyCreatedSpartan;
    int actualStatusCodeAfterSendingPostRequest;

    public void patchSpartan(String endPoint){
        Map<String, Object> spartanPayload = new LinkedHashMap<>();
        spartanPayload.put("name", "Alejandro");
        Response response =
                given()
                        .baseUri("http://54.211.84.13:8000")
                        .basePath("/api")
                        .contentType(ContentType.JSON)
                        .body(spartanPayload).
                when()
                        .patch(endPoint+idOfNewlyCreatedSpartan);
        actualStatusCodeAfterSendingPostRequest = response.getStatusCode();
    }

    public int getActualStatusCode(){
        return actualStatusCodeAfterSendingPostRequest;
    }

}
