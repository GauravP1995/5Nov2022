package assertClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


public class Assertions2 {
	WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() {
		
		System.out.println("Opening browser");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers For Selenium\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		System.out.println("Open chrome Successfully");

	}

	@Test
	public void Test1() {
		
		String Expected = "Facebook – log in or sign up";
	
		String Actual = driver.getTitle();
		Assert.assertEquals(Actual, Expected);
	}
	@Test
	public void Test3() {
	
		Assert.assertEquals(13, 12);
	}
	
	}

