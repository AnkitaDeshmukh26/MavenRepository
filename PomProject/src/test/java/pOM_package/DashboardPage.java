package pOM_package;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
    }

	@FindBy(xpath="//h3")
	private List<WebElement> coursesOffered;
	
	@FindBy(xpath="//h3//following::p")
	private List<WebElement> coursedetails;
	
	ArrayList<String> actualList=new ArrayList<String>();
	public void getCourses()
	{
	for(WebElement courses:coursesOffered)
	{
		String course=courses.getText();
		actualList.add(course);
		System.out.println(course);
	}
	}
	ArrayList<String> actualList1=new ArrayList<String>();
	public void getCourseDetails()
	{
	for(WebElement details:coursedetails)
	{
		String coursedetailname=details.getText();
		actualList1.add(coursedetailname);
		System.out.println(coursedetailname);
	}
	}
}
