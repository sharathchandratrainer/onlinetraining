package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailLaunch 
{

	public static void main(String[] args) 
	{
		String exptitle="gmAil";
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		String acttitle=driver.getTitle();
		
//		if (exptitle.equals(acttitle))
		if(exptitle.equalsIgnoreCase(acttitle))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	}

}
