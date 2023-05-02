package groups;

import org.testng.annotations.Test;

public class GroupingDemo {
		
		
		@Test(groups= {"regression"})
		public void test1()
		{
			System.out.println("Test1 method present");
		}
		
		@Test(groups= {"sanity"})
		public void test2()
		{
			System.out.println("Test2 method present");
		}
		
		@Test(groups= {"smoke", "regression"})
		public void test3()
		{
			System.out.println("Test3 method present");
		}
		
		@Test(groups= {"smoke"})
		public void test4()
		{
			System.out.println("Test4 method present");
		}
		
		
		@Test(groups= {"US101"})
		public void test5()
		{
			System.out.println("Test101 method present");
		}
		
		
		@Test(groups= {"US102"})
		public void test6()
		{
			System.out.println("Test102 method present");
		}
		
		@Test(groups= {"US103"})
		public void test7()
		{
			System.out.println("Test103 method present");
		}
}
