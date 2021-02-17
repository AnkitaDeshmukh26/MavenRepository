package pOM_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.collections.*;

public class UsersPage {
	
	WebDriver driver;
	
	public UsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Users')]")
	private WebElement users;
	
	@FindBy(xpath="//td[2]")
	private List<WebElement> userName;
	
	@FindBy(xpath="//td[3]")
	private List<WebElement> email;
	
	@FindBy(xpath="//td[6]")
	private List<WebElement> gender;
	
	@FindBy(xpath="//td[4]")
	private List<WebElement> mobile;
	
	public void clickUsers()
	{
		users.click();	
	}
	
	
	public void userSorting()
	{
	ArrayList al =new ArrayList();
	for(WebElement wb:userName)
	{
		String Text=wb.getText();
		//System.out.println("Before Sorting" +Text);
		al.add(Text);
		Collections.sort(al);
	}
	System.out.println(al);
	}
	
	
	public void checkSuffixOfMail()
	{
	for(WebElement wb1:email)
	{
		String text1=wb1.getText();
		
		if(text1.contains("@gmail.com"))
		{
			System.out.println("contains gmail -" +text1);
		}
		else 
		{
			System.out.println("Not contains gmail- " +text1);
		}
	}
	}
	
	public void checkGender()
	{
		int countMale=0;
		int countFemale=0;
		for(WebElement checkGender:gender)
		{ 
			String text2=checkGender.getText();
			if (text2.contains("Male"))
			{
				countMale+=1;
			}
		   if (text2.contains("Female"))
			{
			    countFemale+=1;
			}
		}
		System.out.println("count of Male is=" +countMale);
		System.out.println("count of Female is=" +countFemale);
	}
	
	public void checkMobileDigits()
	{
		for (int i=0;i<mobile.size();i++)
		{   String user=userName.get(i).getText();
			String digits=mobile.get(i).getText();
			System.out.println(user+" - " +digits.length());
		}
	}
	
}


	



	
	
	
