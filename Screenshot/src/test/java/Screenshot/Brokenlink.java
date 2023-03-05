package Screenshot;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycarhelpline.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List <WebElement> ele=driver.findElements(By.tagName("a"));
	//	System.out.println(ele);
		System.out.println(ele.size());
		WebElement linker=ele.get(6);
		String url=linker.getAttribute("href");
		System.out.println(url);
		
		for (WebElement ele1: ele)      //displaying all links
		{
			System.out.println(ele1.getAttribute("href"));
		}
		
		HttpURLConnection h=(HttpURLConnection)(new URL(url)).openConnection();
		h.connect();
		System.out.println(h.getResponseCode());
		
	}

}
