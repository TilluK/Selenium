import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		List <WebElement> star=driver.findElements(By.xpath("//div[@class='col-lg-3 col-md-6 mb-4 mb-lg-0 align-self-center px-5 py-3']"));
		int a=star.size();
		System.out.println(a);
		
		for(WebElement plus:star)
		{
		
			System.out.println(plus.getTagName());
			System.out.println(plus.getLocation());
			System.out.println(plus.getAttribute("class"));
			System.out.println(plus.isDisplayed());
			// plus.click();
		}
	
	star.get(7).click();
   
	System.out.println(star.get(0).getAccessibleName());

	}

}
