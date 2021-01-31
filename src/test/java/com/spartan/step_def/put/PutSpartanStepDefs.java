package com.spartan.step_def.put;

import com.spartan.functions.put.PutSpartan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PutSpartanStepDefs {
    PutSpartan putSpartan = new PutSpartan();

    @Given("I perform PUT request for {string}")
    public void i_perform_put_request_for(String endPoint) {
        putSpartan.putSpartan(endPoint);
    }

    @Then("I should be able to update spartan113")
    public void i_should_be_able_to_update_spartan113() {
        int expectedStatusCode = 204; // No content
        int actualStatusCode = putSpartan.getActualStatusCode();
        System.out.println("actualStatusCode = " + actualStatusCode);

        Assert.assertEquals("Status Code Verification Failed", expectedStatusCode, actualStatusCode);
    }

}
