package pOM_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	LoginPage lp;
	//login

	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver3.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/softwares/Sel/Offline website/index.html" );
		lp=new LoginPage(driver);
	}
	
	@Test
	public void validLogin()
	{
		lp.enterUname("kiran@gmail.coom");
		lp.enterPassword("123456");
		lp.submitLogin();
	}
	

}
