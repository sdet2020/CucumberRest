package com.spartan.step_def.post;

import com.spartan.functions.post.Create1Spartan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Create1SpartanStepDefs {
    Create1Spartan create1Spartan = new Create1Spartan();

    @Given("I perform POST request for {string}")
    public void i_perform_post_request_for(String endPoint) {
        create1Spartan.create1spartan(endPoint);
    }

    @Then("I should be able to add {int} spartan")
    public void i_should_be_able_to_add_spartan(Integer int1) {
        int expectedStatusCode = 201;
        int actualStatusCode = create1Spartan.getActualStatusCode();
        System.out.println("actualStatusCode = " + actualStatusCode);
        Assert.assertEquals("Status Code Failed!", expectedStatusCode, actualStatusCode);
    }
}
