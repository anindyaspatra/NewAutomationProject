package com.ui.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "com/ui/stepDef", plugin = { "pretty",
		"html:cucumber-reports-ui/test-output.html" }, tags = "@TestScenario", monochrome = true)
public class TCValidateCountDown {
}