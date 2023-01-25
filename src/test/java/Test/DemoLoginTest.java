package Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import GenericUtils.DriverUtils;
import Pages.DemoLoginPage;
import Pages.LoginPage;

public class DemoLoginTest extends BaseTest {
		@Test
		public void DemoLogin()throws InterruptedException
		{
			DriverUtils.getDriver().get("https://demowebshop.tricentis.com/");
			DemoLoginPage page=new DemoLoginPage();
			DemoLoginPage page1=new DemoLoginPage();
			Thread.sleep(3000);
			page.clickLogin();
			page.enterEmail("ksairamyakrishna@gmail.com");
			Thread.sleep(3000);
			page.enterPassword("Krishna@12");
			Thread.sleep(3000);
			page.LoginClick();
			Thread.sleep(3000);
			page1.hoverComputer(driver);
			Thread.sleep(3000);
			page1.clickDesktops();
			Thread.sleep(3000);
			page1.SelectItem();
			Thread.sleep(3000);
			page1.SelectAddtocart();
			
			
	}

}

