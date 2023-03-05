import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		WebElement star=driver.findElement(By.xpath("//div[@class='row justify-content-around pt-4 pb-5 px-5']//div[5]"));		
	
		star.getText();
		 
		System.out.println(star.getText());
		star.click();
	}
	

}
