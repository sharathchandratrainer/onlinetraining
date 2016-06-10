package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class linkstest2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://192.168.1.100/primusbank1/sitemap.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.linkText("Home")).click();
		
		List<WebElement> links=driver.findElements(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li/a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
			links.get(i).click();
			System.out.println(driver.getTitle()+"---------"+driver.getCurrentUrl());
			driver.navigate().back();
			Sleeper.sleepTight(5000);
			links=driver.findElements(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li/a"));
			
			Sleeper.sleepTight(5000);
		}
		

	}

}
