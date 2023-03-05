import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement A=driver.findElement(By.xpath("//input[@title='Search']"));
		A.sendKeys("Selenium" + Keys.ENTER);
		
		//Explicit Wait
		
		WebDriverWait W=new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement W1=W.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Selenium']")));
		
//driver.findElement(By.xpath("//h3[normalize-space()='Selenium']")).click();
			W1.click();
		
		
	}

}
