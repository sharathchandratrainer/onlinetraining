package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttons {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		List<WebElement> radio=driver.findElements(By.xpath(".//*[@id='SearchForm']/nav/ul/li/label"));
		for (int i = 0; i < radio.size(); i++) 
		{
			String radiotext=radio.get(i).getText();
				
			if (radiotext.equalsIgnoreCase("multi-city"))
			{
				radio.get(i).click();
				if (radio.get(i).isSelected())
				{
					System.out.println("Pass");
					break;
				}
				else
				{
					System.out.println("Fail");
				}
				
				
			}
		}

	}

}
