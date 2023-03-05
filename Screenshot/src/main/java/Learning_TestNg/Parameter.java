package Learning_TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Parameter {
	
	WebDriver driver;
	
	
	@Parameters({"UID","Pass","URL"})
	@Test
	
	
	public void Login(String UID, String Passd, String URL ) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UID);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Passd);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
	
	
	

}
