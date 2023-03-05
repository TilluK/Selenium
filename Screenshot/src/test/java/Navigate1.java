import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
/*		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();       
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().refresh();       
		driver.navigate().back();        */
		
     //  WebElement star=driver.findElement(By.xpath("//a[@target='_top' and @data-pid='23']"));    //Gmail
       WebElement star=driver.findElement(By.xpath("//a[normalize-space()='Gmail']"));
       
       //String Star1=star.getText();
       System.out.println(star.getText());
       star.click();

	}

}
