package com.project;

import org.openqa.selenium.WebDriver;



public class MainClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		login.login();
		
		HeaderCheck.checklogo();
		
		//Categories.categories();
		
		//TakeScreenshot.getScreenShot(WebDriver driver, String imgname);
	}
}
