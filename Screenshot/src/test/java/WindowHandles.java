import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jeevansangini.com/Logout.jsp");
		driver.manage().window().maximize();
		
		String S1=driver.getWindowHandle();
		 System.out.println("Window Id :"+ S1);
		 System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[normalize-space()='click here']")).click();
		
		// GetWindowHandles  Direct Method
		Set<String> S2= driver.getWindowHandles();
		System.out.println("Window Id :"+ S2);
		
		//Using Iterator Method finding WindowHandles
		Iterator <String> it=S2.iterator();   //<---
		 String Parent=it.next();
		 String Child=it.next();
		 
		 System.out.println("Parent"+ Parent );
		 System.out.println("Child "+ Child);       
		 
		//Using List/ArrayList Method finding WindowHandles
		 List<String> S2List=new ArrayList(S2);
		 
		 String Parent1=S2List.get(0);
		 String Child1=S2List.get(1);
		 
		 System.out.println(Parent1);
		 System.out.println(Child1);
		 Thread.sleep(3000);
		 
		 driver.switchTo().window(Parent1);   //Switching To Parent Window
		 System.out.println(driver.getTitle());
		 Thread.sleep(3000);
		 
		 driver.switchTo().window(Child1);
		 System.out.println(driver.getTitle());
	
		 
		
	
	}

}
