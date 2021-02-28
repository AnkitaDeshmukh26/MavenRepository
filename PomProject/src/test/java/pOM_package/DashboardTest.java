package pOM_package;

import java.util.ArrayList;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTest {
	
	WebDriver driver;
	DashboardPage dp;
	LoginPage lp;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver3.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/softwares/Sel/Offline website/index.html");
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
		dp=new DashboardPage(driver);
	}
	
	@Test
	public void testForCourses()
	{
		ArrayList expectedList=new ArrayList();
		expectedList.add("Selenium");
		expectedList.add("Java / J2EE");
		expectedList.add("Python");
		expectedList.add("Php");
		lp.logIn();
		dp.getCourses();
		System.out.println("Actual list - "+dp.actualList.size());
		System.out.println("Expected list - "+expectedList.size());
		Assert.assertEquals(dp.actualList,expectedList);
	}
	
  @Test
  public void testForCourseDetails()
  {
	  ArrayList expectedList1=new ArrayList();
	  expectedList1.add("Automation Testing");
	  expectedList1.add("Software Development");
	  expectedList1.add("Data Science");
	  expectedList1.add("Web Development");
	  lp.logIn();
	  dp.getCourseDetails();
	  System.out.println("Actual list - "+dp.actualList1.size());
	System.out.println("Expected list - "+expectedList1.size());
	  Assert.assertEquals(dp.actualList1, expectedList1);
	  
  }
  
  
  
  
  
  
  
  
  
  
  
}
