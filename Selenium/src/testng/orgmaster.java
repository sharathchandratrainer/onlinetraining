package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class orgmaster 
{
	public static WebDriver driver;
	public static String expval,actval;
	public static String url="http://opensource.demo.orangehrm.com";
	public static String u="Admin",p="admin";
	public static String f="Sharath1",l="Chandra";
	public static String ename="Sharath1 Chandra",uname="Sharath123",pwd="Sharath12345678",cpwd="Sharath12345678";
	@BeforeSuite
	public void org_Launch()
	{
		expval="btnLogin";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		actval=driver.findElement(By.id("btnLogin")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Launch failed");
	}
	@AfterSuite
	public void org_close()
	{
		driver.close();
	}
	
	@BeforeTest
	public void org_Login()
	{
		expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		actval=driver.findElement(By.id("welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Login failed");
	}
	@AfterTest
	public void org_Logout()
	{
		expval="btnLogin";
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Logout failed");
	}
		

}
