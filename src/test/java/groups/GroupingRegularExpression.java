package groups;

import org.testng.annotations.Test;

public class GroupingRegularExpression {
	
	@Test(groups= {"US101.regression"})
	public void test5()
	{
		System.out.println("Test101 method present");
	}
	
	
	@Test(groups= {"US102.sanity"})
	public void test6()
	{
		System.out.println("Test102 sanity method present");
	}
	
	@Test(groups= {"US102.regression"})
	public void test7()
	{
		System.out.println("Test102 regression method present");
	}
	
	@Test(groups= {"US102.smoke"})
	public void test8()
	{
		System.out.println("Test102 smoke method present");
	}

}
