package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class takingscreenshot {

	public static void main(String[] args) throws IOException 
	{
		String path="F:\\onlineTraining\\Selenium\\src\\screenshots\\";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://192.168.1.100/primusbank1/sitemap.html");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		driver.findElement(By.linkText("Home")).click();
		
		List<WebElement> links=driver.findElements(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li/a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
			links.get(i).click();
			System.out.println(driver.getTitle()+"---------"+driver.getCurrentUrl());
			
			//taking screen shot 
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(path+driver.getTitle()+i+".png"));
			
			
			driver.navigate().back();
			links=driver.findElements(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li/a"));

		}
		

	}

}
