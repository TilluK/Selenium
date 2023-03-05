import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait1 {


	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
	//	driver.get("https://mahabhunakasha.mahabhumi.gov.in/bhunaksha/27/index.jsp");
		driver.manage().window().maximize();
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		WebElement search =driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("Facebook"+ Keys.BACK_SPACE + Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//h3[normalize-space()='Facebook - log in or sign up']")).click();

	}

}
