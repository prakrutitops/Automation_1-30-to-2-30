package com.a305;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseEventEx 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverConnction.getconnection("https://www.amazon.in/");
		
		WebElement sell = driver.findElement(By.linkText("Sell"));
		Thread.sleep(1000);
		WebElement mobile = driver.findElement(By.linkText("Mobiles"));
		Thread.sleep(1000);
		WebElement fashion = driver.findElement(By.linkText("Best Sellers"));
		Thread.sleep(1000);
		Actions builder = new Actions(driver);
		
		
		builder.moveToElement(sell).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(mobile).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(fashion).build().perform();
		Thread.sleep(2000);
		
	}
}
