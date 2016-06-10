package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class orghrmLogin 
{

	public static void main(String[] args)
	{
		String expval="welcome admin";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement link=driver.findElement(By.linkText("Welcome Admin"));
		
//		String actval=link.getText();
//		
//		if (expval.equalsIgnoreCase(actval)) 
//		{
//			System.out.println("Pass");
//			
//		}
//		else
//		{
//			System.out.println("Fail");
//			
//		}
		
		if (link.isDisplayed())
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
		
		

	}

}
