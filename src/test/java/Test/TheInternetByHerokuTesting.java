package Test;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.GoogleSearchPage;
import Pages.HerokuTheInternet;
import Pages.addElement;

@Test
public class TheInternetByHerokuTesting {
	
	public static void main(String[] args) {
		GoogleSearch();
	}
	
	public static void GoogleSearch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maximize chrome
		
		driver.manage().window().maximize();
		
		// open google chrome default tab
		
		driver.get("https://google.com");
		
		// enter the desired search
		
		GoogleSearchPage.textBoxSearch(driver).sendKeys("Heroku the internet");
		
		// click on search button
		
		GoogleSearchPage.searchButton(driver).click();
		
		// open the first result
		
		GoogleSearchPage.firstResult(driver).click();
		
		// opening add elements section
		
		HerokuTheInternet.addElements(driver).click();
		
		// add elements section testing
		String actualString = addElement.title(driver).getText();
		String expectedString = "Add/Remove Elements";
		Assert.assertEquals(actualString, expectedString, "titles do not match");
		
		
		
		
		// closing the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
	}
	
}
