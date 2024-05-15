package Task15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplecode {

	public static void main(String[] args) {
		
		        // Initialize chormeDriver
		WebDriver driver = new ChromeDriver();
		
		// open google
		driver.get("https://www.google.com/");
		
		//find the search box element and enter the search
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("facebook");
		
		//submit the search by enter
		searchBox.sendKeys(Keys.ENTER);
		
		//print the page title
		System.out.println("Page Title: "+ driver.getTitle());
		
		
	}

}
