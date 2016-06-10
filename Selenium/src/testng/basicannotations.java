package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class basicannotations 
{
	@Test(priority=0)
	public void function1()
	{
		System.out.println("This is function1 code");
	}
	@Test(enabled=false)
	public void function2()
	{
		System.out.println("This is function2 code");
	}
	@Test
	public void function3()
	{
		throw new SkipException("I dont want to execute this testcase");
	}
	
	@Test(priority=2)
	public void a()
	{
		System.out.println("This is function a code");
	}

}
