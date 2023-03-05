import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	/*	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement right=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions a=new Actions(driver);
		a.contextClick(right).build().perform();     //Right Click Button
		                                 */
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doble = driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		
		Actions b=new Actions(driver);
		b.doubleClick(doble).build().perform();
		driver.switchTo().alert().accept();
		
		
	
	}

}
