package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class dropdowneg1 {

	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("fromCity"));
		
		Select s=new Select(drop);
		//this is for from drop
		List<WebElement> flist=s.getOptions();
		System.out.println(flist.size());

		WebElement todrop=driver.findElement(By.id("toCity"));
		//this is for tocity
		Select t=new Select(todrop);
		
		for (int i = 0; i < flist.size(); i++)
		{
			s.selectByIndex(i);
			String fcitytext=flist.get(i).getText();
			System.out.println(fcitytext);
			
			List<WebElement> tolist=t.getOptions();
			
			for (int j = 0; j < tolist.size(); j++)
			{
				t.selectByIndex(j);
				String tcitytext=tolist.get(j).getText();
				if (fcitytext.equalsIgnoreCase(tcitytext))
				{
					flag=true;
					break;
					
				}
			}
			if (flag)
			{
				System.out.println("from city available in to city");
				break;
				
			}
			
		}
		

	}

}
