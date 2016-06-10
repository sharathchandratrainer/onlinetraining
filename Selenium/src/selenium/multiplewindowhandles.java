package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class multiplewindowhandles {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.findElement(By.linkText("Privacy")).click();
		
		driver.findElement(By.linkText("Help")).click();
		
		driver.findElement(By.linkText("About Google")).click();

//		driver.findElement(By.linkText("Terms of Service")).click();
		
		Set<String> windowid=driver.getWindowHandles();
		
		Iterator<String> it=windowid.iterator();
		
		
		while (it.hasNext())
		{
			String window=it.next();
			System.out.println(window);
			
			driver.switchTo().window(window);
			
			System.out.println(driver.getTitle());
//			if (driver.getTitle().contains("Privacy Policy")) 
//			{
//				driver.findElement(By.linkText("Terms of Service")).click();
//				Sleeper.sleepTightInSeconds(5);
//				System.out.println(driver.getTitle());
//				
//			}
			
			try
			{
				driver.findElement(By.xpath("html/body/div[2]/section/div/article/nav/section[2]/h2")).click();
				Sleeper.sleepTightInSeconds(5);
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("html/body/div[2]/section/div/article/nav/section[2]/div/div/div[3]/a")).click();
				Sleeper.sleepTightInSeconds(5);
				System.out.println(driver.getTitle());
				break;
			}
			catch (Exception e)
			{
//				System.out.println(e.getMessage());
				System.out.println("Link not found in the page : "+driver.getTitle());
			}
			
			
		}
		
	}

}
