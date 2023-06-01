package com.a305;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozilaLaunchEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver", "E:\\chromedriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
}
