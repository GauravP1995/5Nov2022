package pageFactoryActitimePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLogIn {
	
	@FindBy (xpath = "//input[@id='username']")
	private WebElement Username;
	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement Password;
	@FindBy (xpath = "//a[@id='loginButton']")
	private WebElement LogIn;
	WebDriver driver;
	
	public PageFactoryLogIn (WebDriver driver){		//Constructor
		
		PageFactory.initElements(driver, this);		
	}
	
	public void setActiTimeUsername() {
		
		Username.sendKeys("admin");
	}
	public void setActiTimePassword() {
		Password.sendKeys("manager");
	}
	public void setActiTimeLogIn() {
		LogIn.click();
	}	
}
