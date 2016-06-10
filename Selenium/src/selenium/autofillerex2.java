package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class autofillerex2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("b");
//		driver.findElement(By.id("twotabsearchtextbox")).click();
		Sleeper.sleepTightInSeconds(40);
		WebElement block=driver.findElement(By.id("suggestions"));
				
				
		List<WebElement> auto=block.findElements(By.tagName("div"));
		System.out.println(auto.size());
		for (int i = 0; i < auto.size(); i++) 
		{
			String actval=auto.get(i).getAttribute("id");
			System.out.println(actval);
			if (actval.equalsIgnoreCase("issDiv5"))
			{
				auto.get(i).click();
//				auto.get(i).click();
				break;
				
			}
		
			
		}

	}

}
