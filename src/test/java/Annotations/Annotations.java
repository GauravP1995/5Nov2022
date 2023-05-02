package Annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class Annotations {
	
		@BeforeSuite				
		public void beforeSuit()
		{
			System.out.println("Before Suite Is Present");
		}
		
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("Before Test Is Present");
		}
		
		@BeforeClass								//No of scenarios and no of methods astil tar
		public void beforeClass()
		{
			System.out.println("Before Class Is Present");
		}
		
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before Method Is Present");
		}
		
		@Test
		public void test1()
		{
			System.out.println("Out Test Function or main scenario is executing");
		}
		
		@Test
		public void test2()
		{
			System.out.println("22222222 Test Function or main scenario is executing");
		}
		
		@AfterMethod
		public void AfterMethod()
		{
			System.out.println("After Method Is Present");
		}
		
		@AfterClass
		public void AfterClass()
		{
			System.out.println("After Class Is Present");
		}
		
		@AfterTest
		public void AfterTest()
		{
			System.out.println("After Test Is Present");
		}
		
		@AfterSuite
		public void afterSuit()
		{
			System.out.println("After Suit is present");
		}
}
