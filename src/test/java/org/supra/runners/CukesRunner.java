package org.supra.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "org/supra/step_definitions",
        tags = "@googleMultiple",
        dryRun = false,
        publish = true
)
public class CukesRunner {

}
