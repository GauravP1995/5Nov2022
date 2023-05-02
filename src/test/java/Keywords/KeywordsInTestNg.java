package Keywords;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KeywordsInTestNg {

	
	@Test (priority = 1)
	public void def()
	{
		System.out.println("DEF Present");
	}
	
	@Test (priority = 2, timeOut=2000)		//If This Time Is More Than Thread.Sleep Then It Will Give Error
	public void ghi() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("GHI Present");
	}
	
	@Test (priority = 2, timeOut=2000)		//Using Assert Method We Will Make It Fail Test Cases
	public void ghii()
	{
		System.out.println("GHII Present");
		Assert.fail();
	}
	
	@Test (priority = 3, invocationCount=3)
	public void jkl()
	{
		System.out.println("JKL Present");
	}
	
	@Test (priority = 4, enabled = true)		//It will Skipped Bcoz Of False
	public void abc()
	{
		System.out.println("ABC Present");
	}
	
	@Test (priority = 5)
	public void mno()
	{
		System.out.println("MNO Present");
	}

	@Test (dependsOnMethods= {"abc"})
	public void kll()
	{
		System.out.println("MNO Present");
	}
	
}
