package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class empreg extends orgmaster
{
	
	@Test(dataProvider="empdata")
	public void org_Empreg(String f, String l)
	{
		expval=f+" "+l;
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval,"Empreg failed");
	}
	
	@DataProvider
	public Object[][] empdata()
	{
		Object[][] data=new Object[6][2];
		//1 st Row
		data[0][0]="Priyanka";
		data[0][1]="R";
		//2 nd Row
		data[1][0]="Murali";
		data[1][1]="S";
		//3 rd row
		data[2][0]="Sharath";
		data[2][1]="Chandra";
		//4 th row
		data[3][0]="Suresh";
		data[3][1]="B";
		//5 th row
		data[4][0]="Venki";
		data[4][1]="Ch";
		//6 th row
		data[5][0]="Sandeep";
		data[5][1]="G";
		
		return data;
	}

}
