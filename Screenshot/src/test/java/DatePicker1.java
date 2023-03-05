import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='departon']")).click();

// For Month
		Select month_drop = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
		month_drop.selectByVisibleText("Sep");

		// For Year
		Select year_drop = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
		year_drop.selectByVisibleText("2023");

		// For Date
		String Date = "19";

		List<WebElement> Dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		for (WebElement Dt : Dates) {
			String Dt1 = Dt.getText();
			if (Dt1.equals(Date)) {
				Dt.click();
				break;
			}
		}

	}
}
