package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderCheck 
{
	
	
	public static void checklogo() throws InterruptedException
	{
		/*
		 * Thread.sleep(2000); WebDriver driver2 =(WebDriver)
		 * driver.findElement(By.xpath("//*[@id=\"nava\"]/img")); ((WebElement)
		 * driver2).click();
		 */
		//System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		
		DriverConnection.driver.findElement(By.linkText("PRODUCT STORE")).click();
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(2000);
		
		
	}
	
}
