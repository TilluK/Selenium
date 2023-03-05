import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Drag and Drop
		/*
		 * driver.get("https://demo.guru99.com/test/drag_drop.html");
		 * driver.manage().window().maximize(); WebElement
		 * src=driver.findElement(By.xpath(
		 * "//section[@id='g-container-main']//li[4]//a[1]")); WebElement des=
		 * driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		 * 
		 * WebElement src1=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		 * WebElement des1=
		 * driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		 * 
		 * Actions a=new Actions(driver); 
		 * a.dragAndDrop(src, des).build().perform();
		 * a.dragAndDrop(src1, des1).build().perform();
		 */

		//Mouse hover action
		driver.get("https://www.mycarhelpline.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement home = driver.findElement(By.xpath("//li[@class='item-198 default current active']//a[contains(text(),'Home')]"));
		WebElement car = driver.findElement(By.xpath("//a[contains(text(),'New Car')]"));
		WebElement used= driver.findElement(By.xpath("//a[normalize-space()='Used Car']"));
		WebElement review =driver.findElement(By.xpath("//a[normalize-space()='Reviews']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(home).moveToElement(car).moveToElement(used).moveToElement(review).click().build().perform();
		
		WebElement forum=driver.findElement(By.xpath("//a[normalize-space()='Forum Q&A']"));
		a.moveToElement(forum).click().build().perform();

	}

}
