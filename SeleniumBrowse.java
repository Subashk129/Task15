package Task15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowse {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium Browser Driver");
		
		searchBox.sendKeys(Keys.ENTER);
		
	
	}
}
