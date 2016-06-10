package selenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class calander {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String date=sc.next();
		
		String[] datesplit=date.split("/");
		String day=datesplit[0];
		String month=datesplit[1];
		String year=datesplit[2];
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
//		WebDriver d=new FirefoxDriver();
		WebDriver d=new ChromeDriver();
		d.get("http://www.cleartrip.com/");
		d.manage().window().maximize();
		
		d.findElement(By.id("DepartDate")).click();
		
		//year selection
		String calyear=d.findElement(By.className("ui-datepicker-year")).getText();
		
		
		while (!calyear.equals(year))
		{	
			d.findElement(By.className("nextMonth ")).click();
			
			calyear=d.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		
		//month selection
		
		String calmonth=d.findElement(By.className("ui-datepicker-month")).getText();
		
		while (!calmonth.equalsIgnoreCase(month))
		{
			d.findElement(By.className("nextMonth ")).click();
			calmonth=d.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		//day selection
		
		List<WebElement> rows=d.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++)
			{
				String calday=cols.get(j).getText();
				if (calday.equals(day))
				{
					cols.get(j).click();
					break;
				
				}
				
			}
			
		}
		
		
		

	}

}
