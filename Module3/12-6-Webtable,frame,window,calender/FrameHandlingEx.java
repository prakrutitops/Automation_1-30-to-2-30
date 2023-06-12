package com.a305;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHandlingEx 
{
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = DriverConnction.getconnection("https://demoqa.com/frames");
		
		
		WebElement myframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(myframe);
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		
		
		
	}
	
}
