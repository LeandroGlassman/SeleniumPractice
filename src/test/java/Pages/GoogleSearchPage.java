package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	private static WebElement element = null;
	
	public static WebElement textBoxSearch(WebDriver driver) {
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]"));
		return element;	
	}
	
	public static WebElement firstResult(WebDriver driver) {
		element = driver.findElement(By.className("iUh30"));
		return element;
	}
}
