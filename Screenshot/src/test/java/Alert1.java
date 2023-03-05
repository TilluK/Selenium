import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		// Alert Window with OK button----
		/*
		 * driver.findElement(By.
		 * xpath("//button[normalize-space()='Click for JS Alert']")).click();
		 * Thread.sleep(3000); driver.switchTo().alert().accept();
		 */

		// Alert Window with OK button
       /*
		 * driver.findElement(By. xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		 * Thread.sleep(3000); 
		 * // driver.switchTo().alert().accept(); //for OK
		 * driver.switchTo().alert().dismiss(); //For Cancel
		 */

		//  Alert Window with Input box, Capture text from Alert
		driver.findElement(By. xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert AL=driver.switchTo().alert();
		System.out.println("The Message Displayed on Alert :" +"  "+ AL.getText());
		
		AL.sendKeys("My name is Lakhan");
		Thread.sleep(3000);
	//	AL.accept();
		AL.dismiss();
		

	}

}
