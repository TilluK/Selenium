import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newtab {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		String Newtab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Gmail")).sendKeys(Newtab);
		
		String tab=Keys.chord(Keys.CONTROL,Keys.TAB);
		//driver.findElement(By.linkText("Google")).sendKeys(tab);
		driver.switchTo().window(tab);
		driver.switchTo().window(Newtab);
		

	}

}
