import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUplod {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();

		//Uploading files
		
		WebElement Upload=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		Upload.sendKeys("E:\\Selenium Drivers\\New folder\\chromedriver.exe");   //Any File
	//	Upload.sendKeys("E:\\Selenium Drivers\\New folder\\sk.txt"); 
		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		
	}

}
