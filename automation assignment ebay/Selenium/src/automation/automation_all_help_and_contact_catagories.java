package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automation_all_help_and_contact_catagories {
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
		
		  //Click Seller Information Center button
        element = driver.findElement(By.xpath("//a[contains(@href,'seller-center/index.html')]"));
		element.click();
		
		//Click Back button
		driver.navigate().back();
		
		//Click Contact us button
        element = driver.findElement(By.xpath("//a[contains(@href,'help/home')]"));
		element.click();
		
		//Click Back button
		driver.navigate().back();
		
		System.out.println("pass");
		
}
	}
