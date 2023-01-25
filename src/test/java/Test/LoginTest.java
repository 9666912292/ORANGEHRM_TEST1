package Test;
import org.testng.annotations.Test;

import GenericUtils.DriverUtils;
import Pages.LoginPage;
import Pages.Admin;

public class LoginTest extends BaseTest{
	@Test
	public void Login()throws InterruptedException
	{
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage page=new LoginPage();
		Thread.sleep(1000);
		page.enterUsername("Admin");
		page.enterPassword("admin123");
		page.clickLogin(); 
		Admin pt=new Admin();
		pt.clickAdmin();
		Thread.sleep(3000);
		pt.clickAdd();
		Thread.sleep(3000);
		pt.selectAdmin();
		Thread.sleep(3000);
		
	}

}
