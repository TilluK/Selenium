import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jeevansangini.com/Logout.jsp");
		driver.manage().window().maximize();
		
		String A=driver.getWindowHandle();
		System.out.println(A);
		driver.findElement(By.xpath("//a[normalize-space()='click here']")).click();
		Set<String> A1=driver.getWindowHandles();
		System.out.println("Windows ID are "+A1);
		
/*		Iterator<String> A2=A1.iterator();   // Iterator Method
		String Parent= A2.next();
		String Child= A2.next();
		
		System.out.println("Parent is"+ Parent);
		System.out.println("Child is"+ Child);
		
		driver.switchTo().window(Parent);        */
		
		List <String> AR3=new ArrayList<String>(A1);    //ArrayList <String> AR3=new ArrayList<String> (A1);
		String Parent1 =AR3.get(0);
		String Child1=AR3.get(1);
		System.out.println(Parent1);
		System.out.println(Child1);
		
		for (String BAR:AR3)     //We can use for Each loop with array only
		{
			System.out.println(BAR);
			String Title=driver.switchTo().window(BAR).getTitle();
			System.out.println("Title is   "+  Title);
			Thread.sleep(3000);
			
		}
		driver.close();
		
		
		
		
	

	}

}
