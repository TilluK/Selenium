import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/slider/range.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Slider dragging
		WebElement Slider1=driver.findElement(By.xpath("//span[1]"));
		WebElement Slider2=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Location of Slider1: "+ Slider1.getLocation());
		
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.dragAndDropBy(Slider2, 400, 0).build().perform();
		Thread.sleep(4000);
		a.dragAndDropBy(Slider1, 400, 0).build().perform();
		Thread.sleep(4000);
		a.dragAndDropBy(Slider2, -200, 0).build().perform();
		Thread.sleep(4000);
		a.dragAndDropBy(Slider1, -500, 0).build().perform();
		
		
		
	}

}
