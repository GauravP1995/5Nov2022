package navnathScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navnath {
	// WebElement to test = 2 Nos
	 // Declaration by using PageFactory
	@FindBy(xpath="//img[@width='179']")
	private WebElement img;
	@FindBy(xpath="//a[@class='logout']")
	private WebElement lo;
	@FindBy(xpath="//div[text()='Time-Track']")
	private WebElement tt;
	@FindBy(xpath="//div[text()='Tasks']")
 	private WebElement task;
 	@FindBy(xpath="//div[text()='Reports']")
	private WebElement rp;
	WebDriver driver;

	 public Navnath (WebDriver driver) {
	 PageFactory.initElements(driver,this);
	}
	 public void img(){
	 if(img.isDisplayed()==true) {
	 System.out.println("Company Logo is Displayed at Right Place : ");
	 }else {
	 System.out.println("Company Logo is Not Displayed : ");
	}
	 }
	 public void lo() {
	lo.click();
	 }
	 public void tt() {
		 if(tt.isEnabled()==true) {
		System.out.println("Tract Time Stamp Is Enabled : ");
	}
	 tt.click();
	}
	 public void task() {
	if(task.isEnabled()==true) {
	 System.out.println("Task Is Enabled :");
	}
	 task.click();
	 }
	 public void rp() {
	 if(rp.isEnabled()==true) {
	System.out.println("Repaorts is Enabled : ");
	 }
	rp.click();
	}
}
