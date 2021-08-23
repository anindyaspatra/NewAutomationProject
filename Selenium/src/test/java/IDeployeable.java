import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public interface IDeployeable {
	WebDriver driver = new ChromeDriver();
	Object x = null;

	public void display();
	abstract void newTest();

	public static final WebElement element = null;

	static void test() {
	}

	default void test2() {

	}

}
