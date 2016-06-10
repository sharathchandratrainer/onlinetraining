package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class roboteg2 {

	public static void main(String[] args) throws AWTException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("photofile")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		
		
		r.keyPress(KeyEvent.VK_SEMICOLON);
		r.keyRelease(KeyEvent.VK_SEMICOLON);
		
		r.keyPress(KeyEvent.VK_BACK_SLASH);
		r.keyRelease(KeyEvent.VK_BACK_SLASH);
		
		r.keyPress(KeyEvent.VK_BACK_SLASH);
		r.keyRelease(KeyEvent.VK_BACK_SLASH);

	}

}
