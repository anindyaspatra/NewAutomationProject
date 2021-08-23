package com.api.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "com/api/stepDef", plugin = { "pretty",
		"html:cucumber-reports-api/test-output.html" }, tags = "@TestAPIScenario", monochrome = true)
public class TCSpaceXAPI {
}
