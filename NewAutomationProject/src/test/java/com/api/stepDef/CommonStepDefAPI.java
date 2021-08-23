package com.api.stepDef;

import com.api.appCommonMethods.AppCommonMethods;
import core.driver.CoreDriver;

public class CommonStepDefAPI extends CoreDriver {
	static AppCommonMethods appCommMethods;
	
	public static void initializeAPI() {
		appCommMethods = new AppCommonMethods();
	}
	
}
