package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helperPack.HelperClass;

import org.junit.Assert;

public class basicWebDriver {

	HelperClass helper = new  HelperClass();
	 
    public WebDriver driverInitialization() throws Throwable {     
    	WebDriver driver;
    	System.setProperty("webdriver.chrome.driver","/Users/palani/Desktop/softwares/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    
    public void navigateToHomePage(WebDriver driver) throws Throwable { 
        driver.get(helper.getStringValueFromPropFile("baseUrl"));
    }
    public void closeWebpage(WebDriver driver) throws Throwable { 
        driver.close();
    }
    
}
