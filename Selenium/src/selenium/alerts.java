package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerts {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://irctc.co.in");
		driver.manage().window().maximize();
		
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.click();
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();
//		alt.dismiss();

	}

}
