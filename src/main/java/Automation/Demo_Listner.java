package Automation;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Automation.Listn_Inter.class)
public class Demo_Listner {
	@Test(successPercentage =10,invocationCount = 5)
	public void d1()
	{
		System.out.println("second");
		Assert.assertTrue(false);
		
		
	}
	@Test
	public void d2()
	{
		System.out.println("third");
		Assert.assertFalse(true);
	}
	@Test
	public void d4()
	{
		System.out.println("one");
		throw new SkipException("skiping");
	}

@Test
public void check()
{
	
	System.out.println("checking..");
}
	
	
	
}
