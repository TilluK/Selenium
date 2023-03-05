package Learning_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel2 {
	 WebDriver driver;
	 
		
		@Test
		public void ps1() {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// driver.manage().window().maximize();
		 System.out.println("PS1 is Executed");
				
		}
		@Test
		public void ps2() {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 driver.get("https://www.jeevansangini.com/Logout.jsp");
			 System.out.println("PS2 is Executed");
				
		}
		@Test
		public void ps3() {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			 System.out.println("PS3 is Executed");
		}

}
