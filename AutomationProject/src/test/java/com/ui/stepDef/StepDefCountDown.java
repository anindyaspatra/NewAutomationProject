package com.ui.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class StepDefCountDown extends CommonStepDef {
	
	@Then("the count down page should get displayed")
	public void countDownPageDisplayed() {
	    Assert.assertTrue(cdPage.counterPageIsDisplayed());
	}
	
	@Then("the time should get reduced by {int} second every time")
	public void timerReducedEveryTime(Integer timeSec) {
		Assert.assertTrue(cdPage.verifyCounterTimeChange(timeSec));
	}

	@After
	public void tearDown() {
		CloseSession();
	}
}
