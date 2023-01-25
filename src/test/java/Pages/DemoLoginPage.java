package Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginPage extends BasePage {
	@FindBy(xpath="//a[@class='ico-login']")
	private WebElement LoginClick;
	
	public void clickLogin() {
		LoginClick.click();
	}
	@FindBy(xpath="//input[@class='email']")
	private WebElement textEmail;
	
	public void enterEmail(String str) {
	textEmail.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@class='password']")
	private WebElement textPassword;
	
	public void enterPassword(String str) {
	textPassword.sendKeys(str);
	}

	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement clickLogin;
	
	public void LoginClick() {
		clickLogin.click();
	}
    
    @FindBy(xpath="(//a[@href='/computers'])[3]")
    private WebElement HoverComputers;
    
    
    public void hoverComputer(WebDriver driver) 
    {
    	Actions sct=new Actions(driver);
    	sct.moveToElement(HoverComputers).perform();
    	}
    
    @FindBy(xpath="(//a[@href='/desktops'])[3]")
    private WebElement DesktopsClick;
    
    public void clickDesktops() 
    {
    	DesktopsClick.click();
    	}
 
    @FindBy(xpath="(//a[text()='Simple Computer'])")
    private WebElement ItemSelect;
    
    public void SelectItem()
    {
    	ItemSelect.click();
    	}
    @FindBy(xpath="(//input[@value='Add to cart'])[4]")
    private WebElement AddtocartClick;
    
    public void SelectAddtocart() 
    {
    	AddtocartClick.click();
    	}
	
}

