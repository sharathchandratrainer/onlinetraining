package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookLogin {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("inputtext")).sendKeys("gande3@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("123456789");
		
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();

	}

}
