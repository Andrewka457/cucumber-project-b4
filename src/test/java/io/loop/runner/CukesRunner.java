package io.loop.runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "io/loop/step_definitions",
        dryRun = true,
        tags = "@test1"

)

public class CukesRunner {



}
