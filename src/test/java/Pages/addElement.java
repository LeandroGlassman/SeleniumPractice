package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addElement {
private static WebElement element = null;
	
	public static WebElement title(WebDriver driver) {
		element = driver.findElement(By.tagName("h3"));
		return element;	
	}
}
