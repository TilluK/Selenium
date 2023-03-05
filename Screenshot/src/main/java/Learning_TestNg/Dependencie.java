package Learning_TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dependencie {
	public static WebDriver driver;

	@BeforeTest
	public void Start() {
		
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.mycarhelpline.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@Test(priority=1,enabled=true)
	public void LandingPage() {
		System.out.println(driver.getCurrentUrl());
		String CurURL="https://www.mycarhelpline.com/";
		if(CurURL.equalsIgnoreCase("https://www.mycarhelpline.com/"))
			System.out.println("TestCase Landing Page is PASS");
		else
			System.out.println("TestCase Landing Page is FAIL");
		// Assert.fail("Deliberately Failed");
		}
	@Test(priority=2,enabled=true,dependsOnMethods="LandingPage")
	public void Calculator() {
		driver.findElement(By.xpath("//a[normalize-space()='Calculator']")).click();
		}
	
	@Test(priority=3,enabled=true,dependsOnMethods="Calculator")
	public void Return_Homepage() {
		driver.findElement(By.linkText("Home")).click();
		}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
		}
	
	}
