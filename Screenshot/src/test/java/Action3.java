import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		Actions kee=new Actions(driver);
		kee.sendKeys(Keys.ALT).perform();
		Thread.sleep(3000);
		kee.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		kee.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		kee.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		kee.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);
		kee.sendKeys(Keys.SEMICOLON).perform();
		Thread.sleep(3000);
		kee.sendKeys(Keys.ARROW_LEFT).perform();
		Thread.sleep(3000);
		kee.sendKeys(Keys.HOME).perform();
		Thread.sleep(3000);
		kee.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		kee.sendKeys(Keys.SHIFT).perform();
		
		
		
		
		
		
	}

}
