import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(Parameterized.class)
public class LoginPArameters 
{
	
	String username;
	String password;
	
	
	public LoginPArameters(String username,String password) 
	{
		// TODO Auto-generated constructor stub
		
		this.username = username;
		this.password = password;
	}
	
	static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser() throws InterruptedException
	{
		 driver= DriverConnction.getconnection("https://www.demoblaze.com/");
		 
}
	
	@Test
	public void aopenpage()
	{
		driver.findElement(By.linkText("Log in")).click();
	}
	
	@Test
	public void logintest() throws InterruptedException
	{
		
		
		
		
		WebElement uname =  driver.findElement(By.id("loginusername"));
		uname.clear();
		uname.sendKeys(username);
		
		Thread.sleep(3000);
		
		WebElement pass =  driver.findElement(By.id("loginpassword"));
		pass.clear();
		pass.sendKeys(password);
		
		Thread.sleep(3000);
	}
	
	@Parameters
	public static List<Object[]> getData()
	{
		
		Object obj[][] = new Object[4][2];
		
		
		obj[0][0] = "abc@gmail.com";
		obj[0][1] = "abc";
		
		
		obj[1][0] = "xyz@gmail.com";
		obj[1][1] = "xyz";
		
		
		obj[2][0] = "tops@gmail.com";
		obj[2][1] = "tops";
		
		
		obj[3][0] = "tech@gmail.com";
		obj[3][1] = "tech";
		
		return Arrays.asList(obj);
		
	}
	
	
	
	

	
}
