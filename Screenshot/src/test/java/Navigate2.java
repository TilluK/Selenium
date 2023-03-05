import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.quora.com/How-do-I-get-a-value-of-particular-span-tag-which-under-class-in-webdriver");
		driver.manage().window().maximize();
		
		List<WebElement> star=driver.findElements(By.xpath("//a[@class='q-box Link___StyledBox-t2xg9c-0 dFkjrQ puppeteer_test_link qu-cursor--pointer qu-display--block qu-hover--textDecoration--none']/div"));		
		star.size();
		System.out.println(star.size());    //Printing no of Links
		
		for(WebElement links:star)    //Printing links Text
		{
			System.out.println(links.getText());
		}         
		
	}

}
