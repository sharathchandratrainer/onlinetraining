package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxex2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> check=block.findElements(By.tagName("input"));
		System.out.println(check.size());
		
		for (int i = 0; i < check.size(); i++) 
		{
			
			if (check.get(i).isSelected())
			{
				
				check.get(i).click();
			}
			
			
		}	
		
		for (int j = 0; j < check.size(); j++)
		{
			String checktext=check.get(j).getAttribute("value");
			if (checktext.equalsIgnoreCase("milk"))
			{
			
				check.get(j).click();
			}
			
		}

	}

}
