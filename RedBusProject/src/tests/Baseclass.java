package tests;

import java.util.concurrent.*;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

public class Baseclass {
		    
		    public WebDriver driver;
		    
		    @BeforeMethod
		    public void setup()
		    {
		        System.setProperty("webdriver.chrome.driver", "/home/madhuriadapalag/Downloads/chromedriver");
		        driver = new ChromeDriver();
		        driver.get("https://www.redbus.in");
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		          
		    }

	}

