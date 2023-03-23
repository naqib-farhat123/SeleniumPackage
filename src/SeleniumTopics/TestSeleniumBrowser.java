package SeleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSeleniumBrowser {

	public static void main(String[] args) {
		// 

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		ChromeOptions option = new ChromeOptions();
		
        option.addArguments("--remote-allow-origins=*");
        
        WebDriver driver = new ChromeDriver(option);
        
		 driver.get("https://www.google.com/");


	}

}
