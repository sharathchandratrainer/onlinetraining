package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
//		System.out.println(driver.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr[3]/td[3]/a")).getText());

		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		System.out.println("The Nu  mber of rows in table: "+rows.size());
		
		for (int i = 0; i < rows.size(); i++) 
		{
//			System.out.println(rows.get(i).getText());
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("The number of columns for this row"+i+" "+cols.size());
			System.out.println(cols.get(2).getText());
		}
	}

}
