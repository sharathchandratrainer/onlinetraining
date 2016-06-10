package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class logintest 
{
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		
		loginpage lp=PageFactory.initElements(driver, loginpage.class);
		lp.org_Login(lp.u, lp.p);
		
		adminpage ap=PageFactory.initElements(driver, adminpage.class);
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
		
	}

}
