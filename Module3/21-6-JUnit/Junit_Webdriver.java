package unit2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_Webdriver 
{
	
	WebDriver driver=null;
	
	@Before
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}
	
	@Test
	public void test() throws InterruptedException
	{
	
		
		//driver.findElement(By.linkText("Log in")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		
				
	}
	
	
	  @After 
	  
	  public void after() throws InterruptedException 
	  {
		
		 driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();  
	  }
	 
	
	
}
