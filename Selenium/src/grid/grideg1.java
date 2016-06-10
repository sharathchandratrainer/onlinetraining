package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class grideg1
{
	@Test
	public void grid() throws MalformedURLException
	{
		DesiredCapabilities cap;
		
//		cap=DesiredCapabilities.firefox();
//		cap.setBrowserName("firefox");
//		cap.setPlatform(Platform.WINDOWS);
		
//		cap=DesiredCapabilities.chrome();
//		cap.setBrowserName("chrome");
//		cap.setPlatform(Platform.ANY);
		
		cap=DesiredCapabilities.internetExplorer();
		cap.setBrowserName("internet explorer");
		cap.setPlatform(Platform.WINDOWS);
		
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.57:4444/wd/hub"), cap);
		
		driver.get("http://opensource.demo.orangehrm.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		
	}

}
