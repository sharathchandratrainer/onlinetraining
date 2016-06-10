package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class methods {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		//get the title of the page
		
		System.out.println(driver.getTitle());
		//get the url of the page 
		System.out.println(driver.getCurrentUrl());
		
		Sleeper.sleepTightInSeconds(5);
		//navigate()
		
		driver.navigate().to("http://facebook.com");
		//get the title of the page
		
		System.out.println(driver.getTitle());
		//get the url of the page 
		System.out.println(driver.getCurrentUrl());
		//get the page source code
		System.out.println(driver.getPageSource());
		//maximize the browser
		Sleeper.sleepTightInSeconds(5);
		driver.manage().window().maximize();
		
		//
		

	}

}
