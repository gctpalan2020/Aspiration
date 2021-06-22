package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.basicWebDriver;
import pages.homeWebPage;
import pages.spendSavePage;

public class homepage {

	 public static WebDriver driver;
	
	basicWebDriver basicWebDriverObj = new basicWebDriver();
	
	@Given("^user is  on homepage$")
    public void user_is_on_homepage() throws Throwable {     
		driver = basicWebDriverObj.driverInitialization();
		basicWebDriverObj.navigateToHomePage(driver);
    }
    
	@When("^user navigates to Spend and Save Page, verify you see two products$")
	public void user_navigates_to_Spend_and_Save_Page_verify_you_see_two_products()  throws Throwable {
		homeWebPage homeWebPageObj = new homeWebPage(driver);
		homeWebPageObj.spendSaveMenuClick();
		spendSavePage spendSavePageObj = new spendSavePage(driver);
		spendSavePageObj.verify2CardProducts();
		
        
    }
    
	@When("^user clicks Aspiration product, verify page displayed correctly$")
	public void user_clicks_Aspiration_product_verify_page_displayed_correctly() throws Throwable {
		spendSavePage spendSavePageObj = new spendSavePage(driver);
		spendSavePageObj.clickVerifyAspiration();
	}

	@When("^user clicks Aspiration Plus product, verify page displayed correctly$")
	public void user_clicks_Aspiration_Plus_product() throws Throwable {
		spendSavePage spendSavePageObj = new spendSavePage(driver);
		spendSavePageObj.clickVerifyAspirationPlus();
	}

	@Then("^Close the webpage$")
	public void verify_page_displayed_correctly() throws Throwable {
		basicWebDriverObj.closeWebpage(driver);
	}
  
    
}
