import org.openqa.selenium.support.FindBy;

abstract class AbstractClass {
	public abstract void test();

	@FindBy(id = "name")
	public static int x;

}
