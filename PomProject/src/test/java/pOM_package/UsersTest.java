package pOM_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersTest {
	
	WebDriver driver;
	LoginPage lp;
	DashboardPage dp;
	UsersPage up;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver2.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/softwares/Sel/Offline website/index.html");
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
		dp=new DashboardPage(driver);
		up=new UsersPage(driver);
	}
	
	@Test(priority=1)
	public void sortUsers()
	{
		lp.logIn();
		System.out.println("Sorted Users are as follows:");
		up.clickUsers();
		up.userSorting();
	}
	
	@Test(priority=2)
	public void checksuffix()
	{
		lp.logIn();
	    up.clickUsers();
		up.checkSuffixOfMail();	
		up.checkGender();
		up.checkMobileDigits();
	}

}
