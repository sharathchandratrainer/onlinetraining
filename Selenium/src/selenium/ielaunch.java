package selenium;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ielaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "E:\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("Http://seleniumhq.org");

	}

}
