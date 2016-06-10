package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class visiblelinkcount {

	public static void main(String[] args) 
	{
		int count=0;
		WebDriver driver=new FirefoxDriver();
//		driver.get("http://google.com");
		driver.get("http://hdfc.com");
		driver.manage().window().maximize();
		
//		driver.findElement(By.linkText("Gmail")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			if (!links.get(i).getText().equals(""))
				
			{
				System.out.println(links.get(i).getText());
				count=count+1;
			}
//			else
//			{
//				System.out.println("This is an invisible link");
//			}
			
			
		}
		System.out.println("The number of visible links in google page: "+count);
		System.out.println("The number of invisible links in google page: "+(links.size()-count));

	}

}
