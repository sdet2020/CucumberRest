package com.spartan.functions.get;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class GetAllSpartans {
    List<String> listOfAllSpartans = new ArrayList<String>();

    public void getAllSpartans(String endPoint){
        Response response =
        given()
                .baseUri("http://54.211.84.13:8000")
                .basePath("/api"+endPoint)
                .contentType(ContentType.JSON).
        when()
                .get();

        JsonPath jsonPath = response.jsonPath();

        listOfAllSpartans = jsonPath.getList("name");

    }

    public List<String> getTheListOfAllSpartans(){
        return listOfAllSpartans;
    }


}
