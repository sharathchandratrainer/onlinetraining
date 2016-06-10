package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autofillers {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtSource")).sendKeys("H");
		
		List<WebElement> auto=driver.findElements(By.xpath(".//*[@id='Search']/div[1]/div[1]/ul/li"));
		
		for (int i = 0; i < auto.size(); i++)
		{
			String actval=auto.get(i).getText();
			if (actval.equalsIgnoreCase("hyderabad"))
			{
				auto.get(i).click();
				break;
				
			}
			
		}
	}

}
