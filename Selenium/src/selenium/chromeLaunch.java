package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromeLaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://eenadu.com");

	}

}
