package Learning_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel1 {
	
	 WebDriver driver;
	 
	
	@Test(threadPoolSize=3, invocationCount=3)
	public void ts1() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	 driver.get("https://www.mycarhelpline.com/");
	// driver.manage().window().maximize();
	 System.out.println("TS1 is Executed");
			
	}
	@Test
	public void ts2() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.jeevansangini.com/Logout.jsp");
		 System.out.println("TS2 is Executed");
			
	}
/*	@Test
	public void ts3() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.ncs.gov.in/_layouts/15/ncsp/user-management/login.aspx");
		 System.out.println("TS3 is Executed");
	}
	@Test
	public void ts4() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.mycarhelpline.com/");
		 System.out.println("TS4 is Executed");	
	}
	@Test
	public void ts5() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 System.out.println("TS5 is Executed");
	}
	@Test
	public void ts6() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.mycarhelpline.com/");
		System.out.println("TS6 is Executed"); 
	}     */
	
}
