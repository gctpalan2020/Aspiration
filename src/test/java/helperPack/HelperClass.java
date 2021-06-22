package helperPack;

import java.util.NoSuchElementException;

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
}
