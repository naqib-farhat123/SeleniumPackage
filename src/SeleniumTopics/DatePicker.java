package SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// 
		
		System.setProperty("webdriver.chorome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		// Navigate to Formy Project
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		// Date Field
		WebElement dateField = driver.findElement(By.xpath("//input[@id='datepicker']"));
	    dateField.sendKeys("03/13/2023");
		
		// Keys.ENTER
		dateField.sendKeys(Keys.ENTER);
		
		//driver.close();

	}

}
