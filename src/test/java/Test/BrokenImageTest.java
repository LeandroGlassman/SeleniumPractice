package Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;

public class BrokenImageTest {

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
	}
}
