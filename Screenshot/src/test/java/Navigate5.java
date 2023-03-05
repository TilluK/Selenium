import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate5 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.centralbankofindia.co.in/en");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"popupfoot\"]/div/img")).click();
		
	//	WebElement S=driver.findElement(By.xpath("//select[@class='shs-select form-select required']"));
		WebElement S=driver.findElement(By.xpath("//select[@id='edit-field-banking-services-target-id-shs-0-0']"));
		
	  
	    System.out.println(S.getText());
		Select Sdrop=new Select(S);
		//   Sdrop.selectByVisibleText("Deposits");
		//  Sdrop.selectByValue("28");
		Sdrop.selectByIndex(3);   //Deposit
		
		WebElement S1=  driver.findElement(By.xpath("//select[@id='edit-field-banking-services-target-id-shs-0-1']"));
		Select S1drop=new Select(S1);
		S1drop.selectByVisibleText("Education Loan");
	//	S1drop.selectByIndex(3);
		
		WebElement S3=driver.findElement(By.xpath("//*[@id=\"edit-submit-personal-banking-home\"]"));		
	   S3.click();	
		
	 
	}

	
}
