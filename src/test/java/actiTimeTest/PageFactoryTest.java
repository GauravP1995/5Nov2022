package actiTimeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pageFactoryActitimePOM.PageFactoryHomePage;
import pageFactoryActitimePOM.PageFactoryLogIn;

public class PageFactoryTest {
	
	public static void main (String arg[]) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers For Selenium\\chromedriver.exe");
		
		 ChromeOptions options = new ChromeOptions();
	 	 options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");

		Thread.sleep(2000);
		
		PageFactoryLogIn A = new PageFactoryLogIn(driver);
			
			A.setActiTimeUsername();
			A.setActiTimePassword();
			A.setActiTimeLogIn();
			
			
			PageFactoryHomePage B = new PageFactoryHomePage(driver);
			
			B.setVerifyActitimeLogo();
			B.NewTask();
	//		B.setActitimeLogout();
			driver.close();
	}

}
