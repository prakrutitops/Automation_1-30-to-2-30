package unit1;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnnotationLink 
{
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass()
	{
		driver = Driverconnection.connect();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test1()
	{
		assertEquals("Facebook – log in or sign up", driver.getTitle());
	}
	
	@Test
	public void test2()
	{
		
		driver.findElement(By.id("email")).sendKeys("tops");
		driver.findElement(By.id("pass")).sendKeys("tech123");
		driver.findElement(By.name("login")).click();
		
	}
	
	@AfterClass
	public static void close()
	{
		driver.quit();
	}
	
}
