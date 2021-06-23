package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class homeWebPage {

	 public static WebDriver  driver;
	 
	 
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public homeWebPage(WebDriver driver) {
		 this.driver = driver;
	          
	 }
	 
	 //Locator for spend Save Menu field
	 By spendSaveMenu = By.linkText("Spend & Save");
	 
	//Locator for homePageAlert field
	By homePageAlert = By.xpath("//button[text()='Accept Cookies']");
	 
	 
	 
	 //Method to click spend save
	 public void spendSaveMenuClick() {
		 WebDriverWait wait = new WebDriverWait(driver,30);
	
		 WebElement homePageAlertWait = wait.until(ExpectedConditions.visibilityOf(driver.findElement(homePageAlert)));
		 homePageAlertWait.click();
	 
		  WebElement spendSaveWait = wait.until(ExpectedConditions.visibilityOf(driver.findElement(spendSaveMenu)));
		  spendSaveWait.click();
	 }
	 

    
    
}
