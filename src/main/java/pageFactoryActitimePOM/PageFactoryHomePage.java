package pageFactoryActitimePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageFactoryHomePage {
	
		@FindBy (xpath = "//img[@height='61']")
		private WebElement Logo;
		@FindBy (xpath = "//a[@id='logoutLink']")
		private WebElement LogOut;
		@FindBy (xpath = "//a[@class='content tasks']//img[@class='sizer']")
		private WebElement NewTask1;
		@FindBy (xpath="//div[@id='ext-comp-1016']")
		private WebElement CreateTasks;
		@FindBy (xpath = "//button[@class='x-btn-text']")
		private WebElement SelectCustomer;
		
		@FindBy (xpath = "//a[@id='ext-gen172']")
		private WebElement NewCustomer;
		
		@FindBy (xpath="//input[@id='createTasksPopup_newCustomer']")
		private WebElement CustomerName;
		@FindBy (xpath="//input[@id='createTasksPopup_newProject']")
		private WebElement ProjectName;
		@FindBy (xpath="(//input[@class='inputFieldWithPlaceholder'])[1]")
		private WebElement TaskName;
		@FindBy (xpath="//div[@id='createTasksPopup_cancelBtn']")
		private WebElement Cancel;
		
		WebDriver driver;
		
		public PageFactoryHomePage (WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		public void setVerifyActitimeLogo() {
			boolean res = Logo.isDisplayed();	
			
			if (res==true) {
				
				System.out.println("Test Case Passed : True");
			}
			else {
				
				System.out.println("Test Case Passed : False");
			}
			
		}
		
		public void NewTask() throws InterruptedException {
			
			NewTask1.click();
			Thread.sleep(2000);
			CreateTasks.click();
			Thread.sleep(2000);
			SelectCustomer.click();
			Thread.sleep(3000);
			NewCustomer.click();
			Thread.sleep(1000);
		//	Select A = new Select(SelectCustomer);
		//	A.selectByVisibleText("- New Customer -");
			Thread.sleep(1000);
			CustomerName.sendKeys("Gaurav");
			Thread.sleep(1000);
			ProjectName.sendKeys("Velocity");
			Thread.sleep(1000);
			TaskName.sendKeys("Test");
			Thread.sleep(1000);
			Cancel.click();
			
	//		driver.switchTo().alert().dismiss();
		}
		
	//	public void setActitimeLogout() {
			
	//		LogOut.click();
	//	}

}
