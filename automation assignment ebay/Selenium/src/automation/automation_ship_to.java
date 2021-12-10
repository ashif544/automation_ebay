package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automation_ship_to {

	public static void main(String[] args) {
		WebDriver driver = Main.getDriver();
		
		//Nevigation Website
		
		driver.get("https://www.google.com");
		
		//Write Ebay Website
		
		WebElement element =driver.findElement(By.name("q"));
		element.sendKeys("www.ebay.com");
		
		//Enter Search Button
		
		element = driver.findElement(By.name("btnK"));
		element.click();
		
		//Click 2nd link
		
		element = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3"));
		element.click();
		
		//Click Ship To button
		
		element = driver.findElement(By.xpath("//*[@id=\"gh-shipto-click\"]/div/button/span"));
		element.click();
		
		//pop up button
		
		element = driver.findElement(By.className("flag-wrapper"));
		element.click();
		
		System.out.println("Pass");
	}

}
