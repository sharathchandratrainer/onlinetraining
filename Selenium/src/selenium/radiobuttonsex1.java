package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttonsex1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> radio=block.findElements(By.tagName("input"));
//		for (int i = 0; i < radio.size(); i++)
//		{
			List<WebElement> group1=block.findElements(By.name("group1"));
//			System.out.println(radio.get(i).getAttribute("value"));
			for (int j = 0; j < group1.size(); j++)
			{
				if (group1.get(j).getAttribute("value").equalsIgnoreCase("milk"))
				{
					group1.get(j).click();
					if (group1.get(j).isSelected())
					{
						System.out.println("pass");
						break;
					}
					else
					{
						System.out.println("Fail");
					}
					
				}
			}
			
			
			List<WebElement> group2=block.findElements(By.name("group2"));
			for (int k = 0; k < group1.size(); k++)
			{
				if (group2.get(k).getAttribute("value").equalsIgnoreCase("water"))
				{
					group2.get(k).click();
					if (group2.get(k).isSelected())
					{
						System.out.println("pass");
						break;
					}
					else
					{
						System.out.println("Fail");
					}
					
				}
			}
			
			
//		}

	}

}
