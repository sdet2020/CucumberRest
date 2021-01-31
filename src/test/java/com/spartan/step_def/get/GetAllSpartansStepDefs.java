package com.spartan.step_def.get;

import com.spartan.functions.get.GetAllSpartans;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class GetAllSpartansStepDefs {
    GetAllSpartans object = new GetAllSpartans();

    @Given("I perform GET request for {string}")
    public void i_perform_get_request_for(String endPoint) {
        object.getAllSpartans(endPoint);
    }

    @Then("I should get a list of all Spartans")
    public void i_should_get_a_list_of_all_spartans() {
        int size = object.getTheListOfAllSpartans().size();
        Assert.assertNotEquals("FAILED! List of Spartans is 0", 0, size);
    }


}
