package com.a305;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicTableEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = DriverConnction.getconnection("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		String text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
	}
}
