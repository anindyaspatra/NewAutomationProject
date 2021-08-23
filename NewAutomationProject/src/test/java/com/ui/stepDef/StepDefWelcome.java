package com.ui.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefWelcome extends CommonStepDef{
	
	@Given("^I launch the desired URL$")
	public void launchDesiredURL() {
		
		StartSession();
		initialize();
		Assert.assertTrue(wlPage.verifyWelcomePage());
	}

	@When("^I add desired time as '(.*)' in the timer textbox$")
	public void addDesiredTime(String timeValue) {
		Assert.assertTrue(wlPage.enterTime(timeValue));
	}
	
	@When("^click on the GoTimer button$")
	public void clickGoTimerButton() {
		Assert.assertTrue(wlPage.clickOnTimerButton());
	}

}
