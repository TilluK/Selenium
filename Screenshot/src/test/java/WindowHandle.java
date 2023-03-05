import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jeevansangini.com/Logout.jsp");
		driver.manage().window().maximize();
		
		String S1= driver.getTitle();
	     String S2=driver.getCurrentUrl();
	     String S3=driver.getWindowHandle();
	     
	     System.out.println("Title :"+S1);
	     System.out.println("Current URL :"+S2);
	     System.out.println("Window Id :"+ S3);
	     String S4=driver.getWindowHandle();
	     System.out.println("Window Id :"+ S4);
	}

}
