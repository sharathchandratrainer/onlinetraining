package com.orghrm.Master;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class orgMaster 
{
	public static WebDriver driver;
	public static String expval,actval;
	//Launch Function
	public String org_Launch(String url)
	{
		expval="btnLogin";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("id");
		
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	//Login Function
	
	public String org_Login(String u,String p)
	{
		expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		
		actval=driver.findElement(By.id("welcome")).getAttribute("id");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
		
	}
	
	//Logout Function
	
	public String org_Logout()
	{
		expval="btnLogin";
		
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a")).click();
		
		actval=driver.findElement(By.id("btnLogin")).getAttribute("id");
		
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//close Function
	
	public void org_Close()
	{
		driver.close();
	}
	
	//Emp Reg Functionality
	
	public String org_Empreg(String f,String l)
	{
		expval=f+" "+l;
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}	
	}
	
	//User reg Function
	public String org_Userreg(String ename,String Uname,String pwd,String cpwd)
	{
		boolean flag=false;
		expval=Uname;
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		driver.findElement(By.id("btnAdd")).click();	
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(Uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpwd);
		driver.findElement(By.id("btnSave")).click();
		Sleeper.sleepTightInSeconds(5);
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			actval=cols.get(1).getText();
			if (expval.equalsIgnoreCase(actval))
			{
				flag=true;
				break;
			}
		}
		if (flag)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
		
	}

}
