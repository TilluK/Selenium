import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert3 {

	public static void main(String[] args) throws InterruptedException {

//POPUp Notification
		ChromeOptions M1=new ChromeOptions();
		M1.addArguments("---disable-notification");
		
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.poptin.com/?adw-popup-generator&keyword=website%20pop%20up&gclid=EAIaIQobChMI87X1nYTe_AIV7JNmAh3NoQ3oEAAYASAAEgJquvD_BwE");
		 driver.manage().window().maximize();
		 
	driver.findElement(By.xpath("//*[@id=\"poptinFormSubmitButton\"]")).click();
		
	}

}
