package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HerokuTheInternet {
private static WebElement element = null;
	
	public static WebElement addElements(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]"));
		return element;	
	}
}
