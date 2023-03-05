import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchBrowser1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/#/");
		/*
		 * driver.findElement(By.tagName("input")).click(); //for flipkart
		 * //driver.findElement(By.id("container")).sendKeys("8275834560");
		 * driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
		 */
		driver.manage().window().maximize(); // Maximizing Webpage

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getClass());

		
		  driver.findElement(By.id("small-searchterms")).sendKeys("Camera");
		  //driver.findElement(By.linkText("Search")).click();
		  driver.findElement(By.tagName("button")).click(); //Clicking on search button
		  driver.findElement(By.linkText("apparel")).click();
		  
		  int slide=driver.findElements(By.className("nivo-imageLink")).size();
		  System.out.println("Slider Value is "+slide);
		  
		  int links=driver.findElements(By.tagName("a")).size(); //no of links in webpage
		  System.out.println("Links in a Webpage is "+links);
		  
		  
		  // driver.close();
		 

	}

}
