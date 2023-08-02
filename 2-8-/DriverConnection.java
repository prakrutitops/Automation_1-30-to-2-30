package com.util;
import java.sql.Connection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConnection 
{
	
	
	public static WebDriver getconnection(String url)
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			return driver;
		}
	}

	
	

