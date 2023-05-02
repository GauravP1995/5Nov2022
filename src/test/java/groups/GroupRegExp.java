package groups;

import org.testng.annotations.Test;

	public class GroupRegExp {
	
		@Test (groups = {"US-1.Regression"})
	public void FirstName1() {
		
		System.out.println("Gaurav1");
	}
	
	@Test		(groups = {"US-1.Sanity"})				
	public void FirstName2() {
		
		System.out.println("Gaurav2");
	}
	@Test (groups = {"US-1.Regression"})
	public void FirstName3() {
	
	System.out.println("Gaurav3");
}

	@Test		(groups = {"US-1.Sanity"})				
	public void FirstName4() {
	
	System.out.println("Gaurav4");
}
	
	@Test		(groups = {"US-2.Smoke"})				
	public void FirstName5() {
		
		System.out.println("Gaurav5");
	}
	
	@Test		(groups = {"US-2.Regression", "Smoke"})		//Ithe Regression la exclude kela tar varchi pan nahi yenar ani hi pan anhi yenar			
	public void FirstName6() {
		
		System.out.println("Gaurav6");
	}
}
