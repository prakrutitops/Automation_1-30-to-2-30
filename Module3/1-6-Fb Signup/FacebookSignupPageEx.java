package com.a305;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupPageEx 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
			
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("kashmeera");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("k@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("k@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234546");
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("13");
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("2");
		
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByVisibleText("2008");
		
		Thread.sleep(1000);
		
		List<WebElement>gender = driver.findElements(By.name("sex"));
		gender.get(0).click();
		
		driver.findElement(By.name("websubmit")).click();
	}
	
}
