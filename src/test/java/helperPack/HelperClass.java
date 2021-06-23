package helperPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class HelperClass {

	public String asssertIfElementIspresent(WebElement element, String textArea) {
		String message = "";
		try {
			  Assert.assertTrue(element.isDisplayed());
			  message = "The element "+textArea+" was present.";
			} catch(NoSuchElementException nsee) {
				message = "The element "+textArea+" was not located.";
			} catch(AssertionError ae) {
				message =  "The element "+textArea+" was located, but not displayed.";
			}
		
		System.out.println(message);
		return message;
	}
	
	public String getStringValueFromPropFile(String property) throws IOException{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("global.properties");
		prop.load(fis);
		
		return prop.getProperty(property);
			
	}
}
