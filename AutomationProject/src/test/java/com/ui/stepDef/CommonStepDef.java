package com.ui.stepDef;


import core.driver.CoreDriver;
import com.ui.pages.CountDownPage;
import com.ui.pages.WelcomePage;

public class CommonStepDef extends CoreDriver {
	
	static CountDownPage cdPage;
	static WelcomePage wlPage;
	
	public static void initialize() {
		cdPage = new CountDownPage(driver);
		wlPage = new WelcomePage(driver);
	}

}
