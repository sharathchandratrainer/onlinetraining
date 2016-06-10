package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class mouse_keybooard {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		Actions act=new Actions(driver);
		
//		act.moveToElement(gmail).build().perform();
//		
//		Sleeper.sleepTightInSeconds(5);
		act.contextClick(gmail).build().perform();
		
		Sleeper.sleepTightInSeconds(5);
		
//		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.chord("k")).sendKeys(Keys.ENTER).build().perform();
		
		Sleeper.sleepTightInSeconds(5);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
	}

}
