package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtablerecorddel {

	public static void main(String[] args) throws InterruptedException 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		//deleting a record
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			
			if (cols.get(1).getText().equals("0092")) 
			{
				
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				Thread.sleep(5000);
				break;
			}
			else
			{
				System.out.println("0092 employee id not exist");
			}
			
		}	
		
			//validate whether the delete function successful or not
			
			List<WebElement> rows1=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
			
			for (int j = 0; j < rows1.size(); j++)
			{
				List<WebElement> cols1=rows1.get(j).findElements(By.tagName("td"));
				
				if (!cols1.get(1).getText().equals("0092")) 
				{
//					System.out.println("Pass");
					flag=true;
					break;
				}
//				else
//				{
//					System.out.println("Fail");
//				}
				
			}
			if (flag) 
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			
		}
		
		
		
	}


