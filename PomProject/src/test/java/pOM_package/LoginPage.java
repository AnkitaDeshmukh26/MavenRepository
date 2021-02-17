package pOM_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	/*--------------------------------Without using PageFactory --------------------------------------------
	 * public WebElement getUname()
	{
		return driver.findElement(By.id("email"));
	}
	public WebElement getPassword()
	{
	   return driver.findElement(By.id("password"));
	}
	public WebElement submit()
	{
		return driver.findElement(By.xpath("//button"));
	}
	
	public void EnterUname(String Text)
	{
		getUname().sendKeys("kiran@gmail.com");
	}
	public void EnterPassword(String Text)
	{
		getPassword().sendKeys("123456");
	}
	public void SubmitLogin()
	{
		submit().click();
	}
	----------------------------------------------*/
	
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//button")
	private WebElement login;
	
	
	public void enterUname(String Text1)
	{
		uname.sendKeys("kiran@gmail.com");
	}
	public void enterPassword(String Text2)
	{
		pass.sendKeys("123456");
	}
	public void submitLogin()
	{
		login.click();
	}
	
	public void logIn()
	{
		enterUname("kiran@gmail.com");
		enterPassword("123456");
		submitLogin();
	}

}
