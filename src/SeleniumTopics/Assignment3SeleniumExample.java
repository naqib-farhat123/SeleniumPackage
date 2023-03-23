package SeleniumTopics;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Assignment3SeleniumExample {

	public static void main(String[] args) throws InterruptedException {
		// Selenium final Assignment (test)
		// By Naqibullah Farhat
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		
		// Navigate to the webpage
		driver.get("https://www.orangehrm.com/partners");
		driver.manage().window().maximize();
		
		// Click on Become a Partner
		WebElement becomePartners = driver.findElement(By.xpath("//a[normalize-space()='Become a Partner']"));
		becomePartners.click();
		
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs2.get(1));
		
		 // Scroll up the page
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,550)");
		
		Thread.sleep(2000);
		
		WebElement cookie = driver.findElement(By.xpath("//a[@class='optanon-allow-all accept-cookies-button']"));
		cookie.click();
		
		// Full name
		WebElement fullName = driver.findElement(By.id("Form_getForm_Name"));
		fullName.sendKeys("Naqibullah Farha");
		
		// Email
		WebElement email = driver.findElement(By.id("Form_getForm_Email"));
		email.sendKeys("naqib.farhat@123.com");
				
		// Phone number
		WebElement phoneNumber = driver.findElement(By.id("Form_getForm_Contact"));
		phoneNumber.sendKeys("8041112345");
		
		// Company name
		WebElement companyName = driver.findElement(By.cssSelector("#Form_getForm_CompanyName"));
		companyName.sendKeys("Tekdojo");
		
		// Country
		WebElement countryName = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
		countryName.sendKeys("Afghanistan");
		
		// Partnership type
		WebElement partnershipType = driver.findElement(By.id("Form_getForm_PartnershipType"));
		partnershipType.sendKeys("Integration partnership");
		
		// Message
		WebElement enterMessage = driver.findElement(By.name("Comment"));
		enterMessage.sendKeys("Hi, could you please send out more information about the OrangeHRM possibilities. \nThank you");
		
		// I am not a robot
		WebElement iframeSwitch = driver.findElement(By.cssSelector("iframe[title='reCAPTCHA']"));
		iframeSwitch.click();
		
		// Submit
		WebElement submitForm = driver.findElement(By.id("Form_getForm_action_submitForm"));
		submitForm.click();
		
		Thread.sleep(3000);
		
		//driver.quit();
	}
}