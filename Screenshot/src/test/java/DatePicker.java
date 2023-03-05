import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		String date = "15";
		String month = "Dec";
		String yr = "2024";

		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();   //Click On Date option
		
		while (true)     //for looping
		{
			
		String MonYr = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText(); // apr2020
	//	System.out.println(MonYr);

		String arr[] = MonYr.split(" "); // Splitting MonYr text into strings ie Mon & Yr
		String Mon = arr[0];
		String Yr = arr[1];

	//	System.out.println(Mon + Yr);

		if (Mon.equalsIgnoreCase(month) && Yr.equals(yr))

				break;

			else
				driver.findElement(By.xpath("//button[normalize-space()='>']")).click();   //  Arrow Button ->
		}
		
		//Date Selection
		
		List<WebElement> D=driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td"));   //contains all dates in a table
		
		for (WebElement Date:D)
		{
			String Dt=Date.getText();
			
			if (Dt.equals(date))
			{
				Date.click();
				break;
			}
				
		}
		
		
		
	}

}
