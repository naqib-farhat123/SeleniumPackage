package SeleniumTopics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CompleteWebForm {
			public static void main(String[] args) throws InterruptedException {
				// Assignment#2       By: Naqibullah Farhat
				
				System.setProperty("webdriver.chrome.driver", "chromedriver");
				
				ChromeOptions option = new ChromeOptions();
		        option.addArguments("--remote-allow-origins=*");
		        
		        WebDriver driver = new ChromeDriver(option);
				
				// Navigate to Webpage --> Complet Web Form)
				driver.get("https://formy-project.herokuapp.com/");
				Thread.sleep(2000);
				
				// Click on Complete Web Form
				driver.findElement(By.linkText("Complete Web Form")).click();
				driver.manage().window().maximize();
				
				// First name
				WebElement firstName = driver.findElement(By.id("first-name"));
				firstName.sendKeys("Naqibullah");
				
				// Last name
				WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
				lastName.sendKeys("Farhat");
				
				// Job title
				WebElement jobTitle = driver.findElement(By.cssSelector("#job-title"));
				jobTitle.sendKeys("Software Tester");
				
				// Highest level of education
				WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
				radioButton1.click();
				
				// Gender/Sex
				WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
				checkBox1.click();
				
				// Years of exprerences
				WebElement selectMenu = driver.findElement(By.cssSelector("#select-menu"));
				//selectMenu.click();
				selectMenu.sendKeys("2-4");
				
				// Navigate to datepicker
				WebElement datePicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
				datePicker.click();
				
				// Date Field
				WebElement dateField = driver.findElement(By.id("datepicker"));
				dateField.sendKeys("03/31/2021");
				
				// Keys.ENTER
				dateField.sendKeys(Keys.ENTER);
				
				// Submit
				WebElement subMit = driver.findElement(By.xpath("//a[normalize-space()='Submit']"));
				subMit.click();
				
				Thread.sleep(4000);
				
				driver.close();

	}

}
