package com.ui.pages;

import core.driver.ui.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountDownPage {

	boolean flag = false;

	Util util = new Util();

	@FindBy(xpath = "//p[@class = 'ClassicTimer-time']")
	private static WebElement counterText;

	public CountDownPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	public boolean counterPageIsDisplayed() {
		return util.isElementPresent(counterText);
	}

	public boolean verifyCounterTimeChange(int time) {
		int timeWait = time * 2000;
		String afterString = null;
		String beforeString = null;
		int beforeInt = 0;
		int afterInt = 0;
		try {
			for (int i = 0; i < 3; i++) {
				Thread.sleep(timeWait);
				afterString = counterText.getText();
				System.out.println("After String" + afterString);
				if (!afterString.equals(beforeString)) {
					System.out.println("Before String" + beforeString);
					if (i != 0) {
						beforeInt = Integer.parseInt(beforeString.replace(" seconds", ""));
						afterInt = Integer.parseInt(afterString.replace(" seconds", ""));
						if (beforeInt - afterInt == 1) {
							beforeInt = afterInt;
						} else
							return false;
					}
				} else
					return false;
				beforeString = afterString;
			}
			return true;
		} catch (InterruptedException ex) {
			return false;
		}
	}

}
