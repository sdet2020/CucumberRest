package com.spartan.step_def.patch;

import com.spartan.functions.patch.PatchSpartan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PatchSpartanStefDefs {
    PatchSpartan patchSpartan = new PatchSpartan();

    @Given("I perform PATCH request for {string}")
    public void i_perform_patch_request_for(String endPoint) {
        patchSpartan.patchSpartan(endPoint);
    }

    @Then("I should be able to partially update spartan113")
    public void i_should_be_able_to_partially_update_spartan113() {
        int expectedStatusCode = 204; // No Content
        int actualStatusCode = patchSpartan.getActualStatusCode();
        System.out.println("actualStatusCode = " + actualStatusCode);

        Assert.assertEquals("Status Code Verification Failed", expectedStatusCode, actualStatusCode);
    }
}
