package core.driver.ui;


import core.driver.CoreDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends CoreDriver {

	boolean flag = false;
	public static String strError;

	public boolean isElementPresent(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
			return element.isDisplayed();
		} catch (NoSuchElementException ex) {
			strError = ex.getMessage();
			System.out.println(strError);
			return false;
		}
	}

	public boolean clickElement(WebElement element) {
		try {
			element.click();
			return true;
		} catch (NoSuchElementException ex) {
			strError = ex.getMessage();
			return false;
		}
	}

	public boolean enterText(WebElement element, String textValue) {
		try {
			element.sendKeys(textValue);
			return true;
		} catch (NoSuchElementException ex) {
			strError = ex.getMessage();
			return false;
		}
	}

	public boolean clearTextBoxEnterText(WebElement element, String textValue) {
		try {
			if (clickElement(element)) {
				element.clear();
				return enterText(element, textValue);
			} else
				return false;
		} catch (NoSuchElementException ex) {
			// TODO: handle exception
			strError = ex.getMessage();
			return false;
		}
	}

	public boolean selectDropdownByText(WebElement element, String textValue) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(textValue);
			return true;
		} catch (NoSuchElementException ex) {
			strError = ex.getMessage();
			return false;
		}
	}

	public boolean selectDropdownByIndex(WebElement element, int index) {
		try {
			Select select = new Select(element);
			select.selectByIndex(index);
			return true;
		} catch (NoSuchElementException ex) {
			strError = ex.getMessage();
			return false;
		}
	}

}
