package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.StaticInitializerCoercer;

public class login 
{
	//static WebDriver driver ;
	public static void login() throws InterruptedException
	{
				
		//System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
		//WebDriver driver = DriverConnection.getconnection("https://www.demoblaze.com/");
				
		//driver.get("https://www.demoblaze.com/");
		DriverConnection.getconnection();
		DriverConnection.driver.manage().window().maximize();
		
		Thread.sleep(2000);
				
		DriverConnection.driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.id("loginusername")).sendKeys("Kashu");
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.id("loginpassword")).sendKeys("patel");
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		/*
		 * driver.findElement(By.linkText("Sign up")).click(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.id("sign-username")).sendKeys("Kashu");
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.id("sign-password")).sendKeys("patel");
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		 * Thread.sleep(2000);
		 */
	}
}
