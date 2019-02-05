package stepDefinition;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Reader;

public class Hooks {

	static WebDriver driver = null; 
	static Properties testProperties = null;

	@Before ()
	public void beforeScenario(Scenario scenario)
	{
		testProperties = Reader.readPropertiesFile("./test.properties");
		String browser = "";
		browser = testProperties.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		System.out.println("Running " + scenario.getName() + " in " + browser.toUpperCase());
		System.out.println("-------------------------------");
	}


	@After ()
	public void afterScenario(Scenario scenario)
	{
		System.out.println("-------------------------------");
		System.out.println("Finished " + scenario.getName());
		System.out.println("*******************************");
		driver.close();
		driver.quit();
	}
}
