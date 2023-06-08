package com.a305;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventEx 
{
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverConnction.getconnection("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		Actions builder = new Actions(driver);
		
		builder.click(search).keyDown(Keys.SHIFT);
	   
		Thread.sleep(1000);
		
		
		builder.click(search).sendKeys("tops technologies")
			   .keyUp(Keys.SHIFT)
			   .sendKeys(Keys.ENTER)
			   .build()
			   .perform();
		
		
	}
	
}
