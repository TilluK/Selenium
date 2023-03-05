import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {

 WebDriverManager.chromedriver().setup();
 WebDriver driver=new ChromeDriver();
 driver.get("https://the-internet.herokuapp.com/basic_auth");
 driver.manage().window().maximize();
 Thread.sleep(3000);
 

driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
