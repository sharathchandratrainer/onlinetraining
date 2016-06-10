package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validurl {

	public static void main(String[] args) 
	{
		String expurl="https://accounts.google.com/";
		
		WebDriver driver=new FirefoxDriver();
		driver.get("Http://gmail.com");
		driver.manage().window().maximize();
		
		String acturl=driver.getCurrentUrl();
		System.out.println(acturl);
//		if (expurl.equalsIgnoreCase(acturl))
		if(acturl.contains(expurl))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
