package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxLaunch {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		//to open any application you have to use get() method 
		driver.get("http://gmail.com");

	}

}
