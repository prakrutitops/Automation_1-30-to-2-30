import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.DriverConnection;

public class Header_Check_Ex 
{
	static WebDriver driver = DriverConnection.getconnection("https://www.demoblaze.com/");
	public static void checklogo() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nava\"]/img")).click();
	}
	public static void checkheader() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("sign-username")).sendKeys("pranav");
		Thread.sleep(1000);
		driver.findElement(By.id("sign-password")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		checklogo();
		
		Thread.sleep(1000);
		
		checkheader();
		
		
	}
	
	
	
}
