package actiTimeTestNGAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageFactoryActitimePOM.PageFactoryHomePage;
import pageFactoryActitimePOM.PageFactoryLogIn;

public class ActitimeLogoVerify {
	
		WebDriver driver;
		PageFactoryLogIn LogIn;
		PageFactoryHomePage Home;
		
		@BeforeClass
		public void OpenBrowser() {
			
			System.out.println("Opening browser");
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers For Selenium\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.get("http://localhost/login.do");
			
			System.out.println("Open chrome Successfully");
			
			LogIn = new PageFactoryLogIn(driver);		// Hya page varti Driver nhyaycha ahe asa meaning hoto hyacha
			Home =  new PageFactoryHomePage(driver);
			
		}
		
		@AfterClass
		public void ClosingBrowser() {
			System.out.println("Browser is closing");
			driver.quit();
		}
		
		@BeforeMethod
		public void PageFactoryLogIn() {
			
			System.out.println("login in process");
			LogIn.setActiTimeUsername();
			LogIn.setActiTimePassword();
			LogIn.setActiTimeLogIn();
			System.out.println("login completed");
		}
		
		@AfterMethod
		public void PageFactoryHomePage() throws InterruptedException {
			
			System.out.println("Logging out");
		//	Home.setActitimeLogout();
			Home.NewTask();

		}
		
		@Test
		public void ScenarioVerifyLogo() {
		
			System.out.println("Checking 1st scenarion");
			Home.setVerifyActitimeLogo();
			System.out.println("Scenario pass logo verified..");
		}
		@Test
		public void ScenarioClick() throws InterruptedException {
			Home.NewTask();
		}
}
