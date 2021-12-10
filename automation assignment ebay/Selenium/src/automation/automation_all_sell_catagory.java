package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automation_all_sell_catagory {

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
		
		        //Click Start selling button
		        element = driver.findElement(By.xpath("//a[contains(@href,'sl/sell')]"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("//a[contains(@href,'ebay.com')]"));
				element.click();
				
				//Click Learn to sell button
		        element = driver.findElement(By.xpath("//a[contains(@href,'seller-center/get-started/selling-basics.html')]"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("//a[contains(@href,'ebay.com')]"));
				element.click();
				
				 //Click Affiliates button
		        element = driver.findElement(By.xpath("//a[contains(@href,'partnernetwork.ebay.com')]"));
				element.click();
				
				System.out.println("pass");

	}

}
