import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement name=driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement last=driver.findElement(By.xpath("//input[@id='lastName']"));
		
		name.sendKeys("Snehal");
		last.sendKeys("Khobragade");
		
		System.out.println("Placeholder is :"+ last.getAttribute("aria-label"));
		System.out.println("Placeholder is :"+ name.getAttribute("aria-label"));
		
		
	}

}
