package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	private static WebDriver driver;
	@BeforeTest
	public static WebDriver getDriver() {
		if(driver == null ) {
			switch ("chrome") {
			case ("chrome"):
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case ("firefox"):
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case ("safari"):
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			case ("edge"):
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
				
				
			}//switch statement
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageInitializer.initialize();
	}// if statement
		
	return driver;
	}//getDriver Method

}//Class
