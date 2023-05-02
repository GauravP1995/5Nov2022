package groups;

import org.testng.annotations.Test;

	public class MetaGroup {
	
		@Test (groups = {"Regression"})
	public void FirstName() {
		
		System.out.println("Gaurav1");
	}
	
	@Test		(groups = {"Sanity"})				
	public void FirstName1() {
		
		System.out.println("Gaurav2");
	}
	
	@Test		(groups = {"Smoke"})				
	public void FirstName2() {
		
		System.out.println("Gaurav3");
	}
	
	@Test		(groups = {"Regression", "Smoke"})		//Ithe Regression la exclude kela tar varchi pan nahi yenar ani hi pan anhi yenar			
	public void FirstName3() {
		
		System.out.println("Gaurav4");
	}
}
