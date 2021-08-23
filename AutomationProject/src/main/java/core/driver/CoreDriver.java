package core.driver;

import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class CoreDriver {

	private static final String BROWSER = "browser";
	private static final String URL = "url";
	private static final String PAGE_LOAD_TIMEOUT = "pageloadtimeout";
	private static final String CHROME = "Chrome";
	private static final String FIREFOX = "Firefox";
	private static final String IEXPLORER = "InternetExplorer";
	private static final String SAFARI = "Safari";
	private static final String HEADLESS = "headless";

	public static WebDriver driver;
	public static HashMap<String, String> configProp;

	public CoreDriver() {
		ReadConfig pfr = new ReadConfig();
		configProp = new HashMap<String, String>();
		configProp = pfr.readConfigFile();
	}

	public static WebDriver StartSession() {
		String browser = configProp.get(BROWSER);
		String headless = configProp.get(HEADLESS);
		switch (browser) {
		case CHROME:
			InitializeChromeDriver initChrome = new InitializeChromeDriver();
			driver = initChrome.setCapability(driver, headless);
			break;
		case FIREFOX:
			// Code required to Initialize Firefox driver
			break;
		case IEXPLORER:
			InitializeIEDriver initIE = new InitializeIEDriver();
			driver = initIE.setCapability(driver, headless);
			break;
		case SAFARI:
			// Code Required to Initialize Safari Driver
			break;
		default:
			break;
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(configProp.get(PAGE_LOAD_TIMEOUT)),
				TimeUnit.SECONDS);

		driver.get(configProp.get(URL));
		return driver;
	}

	public static void CloseSession() {
		driver.quit();
	}

	public static RequestSpecification StartAPISession() {
		String baseURI = configProp.get(URL);

		InitializeAPI initAPI = new InitializeAPI();
		return initAPI.setRequest(baseURI);

	}

}
