package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getattribute {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		
		System.out.println(username.getAttribute("type"));
		
		System.out.println(username.getAttribute("name"));
		
		System.out.println(username.getAttribute("id"));
		
	}

}
