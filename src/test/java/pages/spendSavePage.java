package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helperPack.HelperClass;

import org.junit.Assert;

public class spendSavePage {

	 public static WebDriver driver;
	 HelperClass helper = new  HelperClass();
	
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public spendSavePage(WebDriver driver) {
	      this.driver = driver;
	          
	 }
	 
	 //Locator for spend Save Menu field
	 By getAspirtaionButton = By.xpath("//button[text()='Get Aspiration']");
	
	 // Locator for aspiration popup close
	 By getAspirtaionPopupClose = By.xpath("//button[@class='close']");
		
	 
	 // Locator for aspiration plus popup close
	 By getAspirtaionPlusPopupClose = By.xpath("//div[@role=\"dialog\"]");
	 
	 
	//Locator for spend Save Menu field
	 By getAspirtaionPlusButton = By.xpath("//button[text()='Get Aspiration Plus']");
		
	 
	//Locator for aspiration Email box
	 By getAspirtaionPopupEmail = By.id("join-waitlist-input");
	 
	//Locator for aspirationPlus - 2 plans
	By getAspirtaionPlusPlans = By.className("options");
	
	//Locator for aspirationPlus - WebElements
	By getAspirtaionPlusPlansDiv = By.xpath("(//div[@class='options'])/div");
	
	//Locator for Yearly plan
	By getYearlyPlan = By.xpath("//*[@ng-click=\"selectPlan('yearly')\"]");
	

	// Locator for Monthly Plan
	By getMonthlyPlan = By.xpath("//*[@ng-click=\"selectPlan('monthly')\"]");
	
	// Locator for Yearly Amount
	By getYearlyPlanAmount = By.xpath("(//*[@ng-click=\"selectPlan('yearly')\"])/p/b");
	
	// Locator for Monthly Amount
	By getMonthlyPlanAmount = By.xpath("(//*[@ng-click=\"selectPlan('monthly')\"])/p/b");
	 
	 //Verify 2 card products
	 public void verify2CardProducts() {

		 WebDriverWait wait = new WebDriverWait(driver,30);
		  WebElement getAspirtaionWait = wait.until(ExpectedConditions.visibilityOf(driver.findElement(getAspirtaionButton)));
		  helper.asssertIfElementIspresent(getAspirtaionWait, "GET Aspiration button");
		  
		  WebElement getAspirtaionPlusElement = driver.findElement(getAspirtaionPlusButton);
		  helper.asssertIfElementIspresent(getAspirtaionPlusElement, "GET Aspiration plus button");
		 
	 }
	 
	 //Verify 2 card products
	 public void clickVerifyAspiration() {
		  
		  WebElement getAspirtaionElement = driver.findElement(getAspirtaionButton);
		  getAspirtaionElement.click();
		

		  WebDriverWait wait = new WebDriverWait(driver,30);
		  WebElement getAspirtaionPopupEmailWait = wait.until(ExpectedConditions.visibilityOf(driver.findElement(getAspirtaionPopupEmail)));
		  helper.asssertIfElementIspresent(getAspirtaionPopupEmailWait, "Aspiration Popup email box");
		  getAspirtaionPopupEmailWait.sendKeys(Keys.ESCAPE);

		 
	 }
	 
	 public void clickVerifyAspirationPlus() throws InterruptedException {
		  
		  WebElement getAspirtaionPlusButtonElement = driver.findElement(getAspirtaionPlusButton);
		  getAspirtaionPlusButtonElement.click();
		

		  WebDriverWait wait = new WebDriverWait(driver,30);
		  WebElement getAspirtaionPlusPlansWait = wait.until(ExpectedConditions.visibilityOf(driver.findElement(getAspirtaionPlusPlans)));
		  helper.asssertIfElementIspresent(getAspirtaionPlusPlansWait, "Aspiration Plus Popup");
		  
		 List<WebElement> getAspirtaionPlusPlansDivTags = driver.findElements(getAspirtaionPlusPlansDiv);
		 Assert.assertEquals(null,getAspirtaionPlusPlansDivTags.size(),2);
		 
		 
		 WebElement getYearlyPlanElement = driver.findElement(getYearlyPlan);
		 helper.asssertIfElementIspresent(getYearlyPlanElement, "Aspiration Plus - yearly plan");
		 
		 WebElement getMonthlyPlanElement = driver.findElement(getMonthlyPlan);
		 helper.asssertIfElementIspresent(getMonthlyPlanElement, "Aspiration Plus - Monthly plan");
		 
		 WebElement getYearlyPlanAmountElement = driver.findElement(getYearlyPlanAmount);

		 String getYearlyPlanAmountElementDouble = getYearlyPlanAmountElement.getText().replace("$", "");
		 Assert.assertEquals(Double.parseDouble(getYearlyPlanAmountElementDouble),71.88,0);
		 
		 WebElement getMonthlyPlanAmountElement = driver.findElement(getMonthlyPlanAmount);
		 String getMonthlyPlanAmountElementDouble = getMonthlyPlanAmountElement.getText().replace("$", "");
		 Assert.assertEquals(Double.parseDouble(getMonthlyPlanAmountElementDouble),7.99,0);

	 }
	 
	 

}
