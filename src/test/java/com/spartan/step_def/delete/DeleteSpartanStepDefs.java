package com.spartan.step_def.delete;

import com.spartan.functions.delete.DeleteSpartan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DeleteSpartanStepDefs {

    DeleteSpartan deleteSpartan = new DeleteSpartan();

    @Given("I perform DELETE request for {string}")
    public void i_perform_delete_request_for(String endPoint) {
        deleteSpartan.deleteSpartan(endPoint);
    }

    @Then("I should be able to delete the spartan")
    public void i_should_be_able_to_delete_the_spartan() {
        int expectedStatusCode = 204;
        int actualStatusCode = deleteSpartan.getActualStatusCode();
        System.out.println("actualStatusCode = " + actualStatusCode);

        Assert.assertEquals("Status Code Verification Failed", expectedStatusCode, actualStatusCode);
    }


}
