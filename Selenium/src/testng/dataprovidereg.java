package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovidereg 
{
	@DataProvider(parallel=true)
	public Object[][] data()
	{
		Object[][] d=new Object[2][3];
		
		d[0][0]="Admin";
		d[0][1]="admin";
		d[0][2]="firefox";
		
		d[1][0]="Admin";
		d[1][1]="admin";
		d[1][2]="chrome";
		
		return d;
	}
	
	@Test(dataProvider="data")
	public void orglaunch(String u,String p, String b)
	{
		WebDriver driver = null;
		
		if (b.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
			
		}
		else if (b.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get("http://opensource.demo.orangehrm.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		
		
		
	}

}
