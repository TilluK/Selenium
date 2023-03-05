import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enabled1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement a = driver.findElement(By.xpath("//input[@id='email']"));
		a.sendKeys("SnehalKhobragade");
		a.sendKeys(Keys.BACK_SPACE);

		WebElement b = driver.findElement(By.xpath("//input[@id='pass']"));
		b.sendKeys("123456789");

		WebElement d = driver.findElement(By.id("u_0_5_+g"));
		d.click();                  
		
		/* boolean c1 = a.isDisplayed();
		System.out.println(c1);

		boolean c2 = a.isEnabled();
		System.out.println(c2);    */

	}

}
