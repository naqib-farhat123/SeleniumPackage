package SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// Drag and Drop Button

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Navigare
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		driver.manage().window().maximize();
		
		// image
		// id locator
		// WebElement image = driver.findElement(By.id("image"));
		
		// class locator --> Failed
		// WebElement image = driver.findElement(By.className("ui-widget-content ui-draggable ui-draggable-handle"));
		
		// Css locator --> passed
		// WebElement image = driver.findElement(By.cssSelector("div[id='image']"));
		
		// xpath locator --> passed
		WebElement image = driver.findElement(By.xpath("//div[@id='image']"));
	
		// box
		WebElement box = driver.findElement(By.id("box"));
		
		// Action
		Actions action = new Actions (driver);
		
		Thread.sleep(2000);
		
		// action   |   .build    |  .performence
		action.dragAndDrop(image, box).build().perform();
		
		driver.close();
		
		
	}

}
