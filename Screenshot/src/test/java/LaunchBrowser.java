import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
	/*	System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");  */
		
     System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");   
		
	/*	WebDriverManager.chromedriver().setup();  
		WebDriver driver=new ChromeDriver();      */
		
	/*	WebDriverManager.firefoxdriver().setup();  
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println("Title of the webpage is :"+ driver.getTitle());
		System.out.println("Current URL of the webpage is :"+ driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}

}
