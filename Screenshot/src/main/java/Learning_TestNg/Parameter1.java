package Learning_TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter1 {
	
	WebDriver driver;
	
	@Parameters({"UNAM","PASS"})
	@Test
	public void para(String UNAM,String PASS) {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.ncs.gov.in/_layouts/15/ncsp/user-management/login.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='ctl00_PlaceHolderMain_loginDGET_LoginDGET_UserName']")).sendKeys(UNAM);
		driver.findElement(By.xpath("//input[@id='ctl00_PlaceHolderMain_loginDGET_LoginDGET_Password']")).sendKeys(PASS);
		driver.findElement(By.xpath("//input[@id='ctl00_PlaceHolderMain_loginDGET_LoginDGET_LoginButton']")).click();
		
		
	}

}
