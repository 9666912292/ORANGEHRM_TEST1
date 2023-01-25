package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Admin extends BasePage {
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement AdminClick;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement AddClick;
	
	@FindBy(xpath="(//div[contains(text(),'Select')])[1]")
	private WebElement AdminSelect;
	
	@FindBy(xpath="//div[contains(text(),'Admin')]")
	private WebElement AdminSelect1;
	
	@FindBy(xpath="(//div[contains(text(),'Select')])[1]")
	private WebElement textTypeforhints;
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\SKASILAN\\eclipse-workspace\\SeleniumTest\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary'])")).click();
		
		
		
		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("Tom T Tomson");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Tom Tomson");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("Tomson@123");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("Tomson@123");
		
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click();

		
			
		
		
		
		WebElement userElement=driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));				
				Select UserRoleDropdown = new Select(userElement);  
				List<WebElement>UserRoleDropdownOptions=UserRoleDropdown.getOptions();
				for(WebElement option:UserRoleDropdownOptions)
				{
					System.out.println(option.getText());
				}
				
				UserRoleDropdown.selectByIndex(1); 
				Thread.sleep(3000);*/
	
	
		

	public void clickAdmin() {
		// TODO Auto-generated method stub
		
	}

	public void clickAdd() {
		// TODO Auto-generated method stub
		
	}

	public void selectAdmin() {
		// TODO Auto-generated method stub
		
	}

	public void selectAdmin1() {
		// TODO Auto-generated method stub
		
	}

	}


