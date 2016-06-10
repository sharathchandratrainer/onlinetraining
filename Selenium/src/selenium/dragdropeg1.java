package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class dragdropeg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/draggable");
		driver.manage().window().maximize();
//		Sleeper.sleepTight(5000);
		
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		
//		driver.switchTo().frame(0);
		WebElement frame123=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame123);
		Sleeper.sleepTight(5000);
		WebElement drag=driver.findElement(By.id("draggable"));
		
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(drag, 200, 100).build().perform();

	}

}
