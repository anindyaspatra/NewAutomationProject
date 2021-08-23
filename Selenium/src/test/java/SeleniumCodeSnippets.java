import java.util.HashSet;
import java.util.List;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class SeleniumCodeSnippets {

    WebDriver driver;

    public void implicitWait() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void explicitWait() {
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
        driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]"));

    }

    public void fluentWait() {
        driver = new ChromeDriver();
        new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(Exception.class)
                .until( driver -> driver.findElement(By.id("foo")));
    }

    /**
     * Iframe Handling in Selenium
     */
    public void frameHandle() {
        driver = new ChromeDriver();
        // By Name or Id
        driver.switchTo().frame("frameName");
        // By index
        driver.switchTo().frame(2);
        // By WebElement
        driver.switchTo().frame(driver.findElement(By.xpath("frameXpath")));

        int noOfFrames = driver.findElements(By.xpath("iframe")).size();
        for (int i = 0; i < noOfFrames; i++) {
            driver.switchTo().frame(i);
            // Do action
            driver.switchTo().defaultContent();
            driver.switchTo().parentFrame(); // ----Immediate Parent
        }
    }

    public void alertHandling() {
        driver = new ChromeDriver();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().getText();
        driver.switchTo().alert().sendKeys("Test");

    }

    public void popUpWindowHandle() {
        driver = new ChromeDriver();
        String mainWindow = driver.getWindowHandle();
        Set<String> childWindows = driver.getWindowHandles();

        for (String childWindow : childWindows) {
            if (!mainWindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
                //Action on Child Window
                //Closing the window if required
                driver.close();
            }
        }

        //switching to the main Window
        driver.switchTo().window(mainWindow);

    }

    /**
     * a. Following - Selects all elements in the document of the current node( )
     * 		Xpath=//*[@type='text']//following::input
     *
     * b. Ancestor - The ancestor axis selects all ancestors element (grandparent, parent, etc.) of the current node
     * 		Xpath=//*[text()='Enterprise Testing']//ancestor::div
     *
     * c. Child - Selects all children elements of the current node
     * 		Xpath=//*[@id='java_technologies']//child::li
     *
     * d. Preceding - Select all nodes that come before the current node
     * 		Xpath=//*[@type='submit']//preceding::input
     * e.
     * 		xpath=//*[@type='submit']//following-sibling::input
     *
     * 		Xpath=//*[@id='rt-feature']//parent::div
     *
     * 		Xpath =//*[@type='password']//self::input
     *
     * 		Xpath=//*[@id='rt-feature']//descendant::a
     *
     *
     *
     */


    public void handleCookies() {
        Set<Cookie> cookieSet = driver.manage().getCookies();

        Select dropdwon = new Select(driver.findElement(By.xpath("")));
        dropdwon.selectByIndex(1);;
        dropdwon.selectByValue("");
        dropdwon.selectByVisibleText("");
    }

}
