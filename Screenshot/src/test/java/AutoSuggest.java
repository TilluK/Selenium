import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggest {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();

driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Maharashtra");

//List<WebElement> A1=driver.findElements(By.xpath("//div[@class='OBMEnb']/li"));
List<WebElement> A1=driver.findElements(By.xpath("//div[@role='presentation']//div[@role='presentation']//ul[@role='listbox']/li"));
int count= A1.size();
System.out.println(count);
A1.get(count-1).click();


	}

}
