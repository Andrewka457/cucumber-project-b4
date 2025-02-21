package io.loop.runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-report.html",
                "json:target/json-reports/json-report.json"},
        features = "src/test/resources/features",
        glue = "io/loop/step_definitions",
        dryRun = true,
        tags = "@google_search"

)

public class CukesRunner {



}
