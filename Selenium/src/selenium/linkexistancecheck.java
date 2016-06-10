package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkexistancecheck {

	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
//		driver.findElement(By.linkText("Gmail")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++)
		{
			if (links.get(i).getText().equalsIgnoreCase("Gmail")) 
			{
				flag=true;
				break;
			}
			
		}
		if (flag) 
		{
			System.out.println("Gmail link available in google page");
			
		}
		else
		{
			System.out.println("Gmail link not available in google page");
		}
		

	}

}
