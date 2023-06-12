package com.a305;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = DriverConnction.getconnection("https://demoqa.com/webtables");
		String name = "Kashmeera";
		
		
		
		
		Thread.sleep(1000);
		
		try
		{
			WebElement text = driver.findElement(By.xpath("//*[text()='"+name+"']"));
			if(text.isDisplayed())
			{
				driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
			}
		}
		catch(Exception e)
		{
			System.out.println("Not Available");
		}
		
		
		
		
	}
}
