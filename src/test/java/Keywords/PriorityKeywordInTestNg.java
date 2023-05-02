package Keywords;

import org.testng.annotations.Test;

public class PriorityKeywordInTestNg {

	@Test (priority = 1)
	public void def()
	{
		System.out.println("DEF Present");
	}
	
	@Test (priority = 2)		//It This Time Is More Than Thread.Sleep Then It Will Give Error
	public void ghi() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("GHI Present");
		//Assert.fail();
	}
	
	@Test (priority = 3)
	public void jkl()
	{
		System.out.println("JKL Present");
	}
	
	@Test (priority = 0)		//It will Skipped Bcoz Of False
	public void abc()
	{
		System.out.println("ABC Present");
	}
	
	@Test (priority = 5)
	public void mno()
	{
		System.out.println("MNO Present");
	}

}
