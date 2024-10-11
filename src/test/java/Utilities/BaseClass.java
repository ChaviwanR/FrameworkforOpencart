package Utilities;

import java.io.FileReader;
import java.util.Properties;
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

		if (driver == null) {
			switch (BaseClass.getProperty("browser")) {
			case ("chrome"):
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case ("firefox"):
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case ("safari"):
				if(!System.getProperty("os.name").toLowerCase().contains("mac")) {
					System.out.println("Your system does not support Safari");
				}
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			case ("edge"):
				if(!System.getProperty("os.name").toLowerCase().contains("window")) {
					System.out.println("Your system does not support Edge");
				}
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			}// switch statement
			driver.manage().deleteAllCookies();
			driver.get(BaseClass.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Constants.implicit_wait_time, TimeUnit.SECONDS);
			PageInitializer.initialize();
		} // if statement

		return driver;
	}// getDriver Method
	
	private static Properties properties;
	static {
		
		try {
			FileReader file = new FileReader(Constants.propertiesFilePath);
			properties = new Properties();
			properties.load(file);
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String keyword) {
		return properties.getProperty(keyword);
	}
	
	

}// Class
