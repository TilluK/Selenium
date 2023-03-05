import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mycarhelpline.com/");
		driver.manage().window().maximize();
		
		//Full Page Screenshot
		/*  driver.findElement(By.linkText("Used Car")).click();  
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des= new File(".\\Screenshot\\UsedCar.png");    */
		
	/*	//Any Section Screenshot
		WebElement sec=driver.findElement(By.xpath("//div[@id='header-container']"));
		File src=sec.getScreenshotAs(OutputType.FILE);
		File des= new File(".\\Screenshot\\Section1.png");    */
		
	//  Logo ScreenShot	
		WebElement logo=driver.findElement(By.xpath("//div[@id='logo-container']//a"));
		File src=logo.getScreenshotAs(OutputType.FILE);
		File des= new File(".\\Screenshot\\logo.png");
				
		FileUtils.copyFile(src, des);
		driver.close();
	}

}
