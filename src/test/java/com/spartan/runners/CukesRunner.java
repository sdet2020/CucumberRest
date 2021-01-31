package com.spartan.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/spartan/step_def",
        dryRun = false,
        //tags = "SmokeTest",
        publish = true
)
public class CukesRunner {
}
