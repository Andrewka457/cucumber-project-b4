package io.loop.runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/html-reports/cucumber-report.html",
                "json:target/json-reports/json-report.json",
                "rerun:target/rerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "C:/Users/Andrey/IdeaProjects/cucumber-project-b4/src/test/resources/features",
        glue = "io/loop/step_definitions",
        dryRun = false,
        tags = "@smoke",
        monochrome = false,
        publish = false

)

public class CukesRunner {


}
