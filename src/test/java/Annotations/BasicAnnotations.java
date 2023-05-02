package Annotations;

import org.testng.annotations.Test;

public class BasicAnnotations {
	
	@Test
	public void FirstName() {
		
		System.out.println("Gaurav");
	}
	@Test						// If we dont write it, it will ignore the method
	public void LastName() {
		int a=10;
		int b =0;
		
	//	System.out.println(a/b);
	}

}
