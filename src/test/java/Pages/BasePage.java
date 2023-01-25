package Pages;
import org.openqa.selenium.WebDriver;
import GenericUtils.DriverUtils;
import org.openqa.selenium.support.PageFactory;
public class BasePage {
	WebDriver driver;
	public BasePage()
	{
		driver=DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

}
