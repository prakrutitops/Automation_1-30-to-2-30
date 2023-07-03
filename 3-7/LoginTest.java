package data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest 
{
	@Parameters({"uname","pass"})
	@Test
	public void login(String username,String password) throws InterruptedException
	{
		
		
		WebDriver driver = DriverConnction.getconnection("https://www.demoblaze.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		
		WebElement u =  driver.findElement(By.id("loginusername"));
		u.clear();
		u.sendKeys(username);
		
		WebElement p =  driver.findElement(By.id("loginpassword"));
		p.clear();
		p.sendKeys(password);
		
		
		
		
	}
}
