package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class gmailLogin 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		//sending text into the email field
		
		//identifying the element by using id property
		WebElement email=driver.findElement(By.id("Email"));
		//sending text into the text box 
		email.sendKeys("sharathqedge449");
		
//		Sleeper.sleepTightInSeconds(5);
		//to clear the text in the text box
//		email.clear();
		
		driver.findElement(By.name("signIn")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector("#signIn")).click();
		
		
		
		
		

	}

}
