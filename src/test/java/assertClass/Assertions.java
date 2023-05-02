package assertClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Assertions {
		
		// Assertion
		// Hard Assert // Soft Assert
	
		@Test
		public void Test1() {
		//	Assertion hardAssert = new Assertion();	 	// Object for Hard Assert
			String Expected = "ABC";
			String Actual = "ABC";
			Assert.assertEquals(Expected, Actual);
		}
		
		@Test
		public void Test2() {				// Hi jar Fail geli tar next text la janar hi total fail honar
			
			System.out.println("start");
			Assert.assertEquals(13, 13, "count is not matched pls check with dev name");
			// Pass
			System.out.println("middle");
			Assert.assertEquals(13, 12, "count is not matched pls check with dev name");
			//fail
			System.out.println("end");
		}

		@Test
		public void Test3()
		{
			Assert.assertEquals(13, 13, "count is not matched pls check with dev name");
		}
		
		@Test
		public void Test4()
		{
			Assert.assertTrue(5>3);			//Pass
			String name = "Dhiraj";
			Assert.assertTrue(name.contains("ira"), "Could Not Match");
			Assert.assertFalse(name.contains("ira"), "Could Not Match");
			Assert.assertNull(name);
		//	Assert.assertNotNull(name);
		}
		
		// Soft Assert
		@Test
		public void Test5()
		{
	//	Assertion softAssert1 = new SoftAssert();		// Object for Soft Assert
		SoftAssert softAssert = new SoftAssert();
		System.out.println("start");
		softAssert.assertEquals(13, 13, "count is not matched pls check with dev name");
		System.out.println("miidle");
		softAssert.assertEquals(13, 12, "count is not matched pls check with dev name");
		System.out.println("end");
		
		softAssert.assertAll();			// He takla tar error sangto kashat ahe te nahitr fakt saglya Test Cases Fakt pass karto
		
		}
		
		@Test
		public void Test6() {
			
			String Expected = "ABC";
			String Actual = "ABc";
			Assert.assertNotEquals(Expected  , Actual);
			
		}
		
}
