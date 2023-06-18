package unit1;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test2 
{
	
	static WebDriver driver;
	
	
	@BeforeClass
	public static void openBrowser()
	{
		driver = Driverconnection.connect();
		driver.get("https://www.demoblaze.com/");
	}
	
	
	@Test
	public void logintest() throws InterruptedException
	{
		System.out.println("Before:");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("loginusername")).sendKeys("yhjsfh");
		Thread.sleep(2000);
		driver.findElement(By.id("loginpassword")).sendKeys("1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		System.out.println("After:");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		
		if(driver.findElement(By.linkText("Log out")).equals("Log out"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
			fail();
		}
		
		
	}
	
	
}
