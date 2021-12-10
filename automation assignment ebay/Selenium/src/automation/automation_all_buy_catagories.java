package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automation_all_buy_catagories {

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
		
		        //Click Registration button
		        element = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[2]/a"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("//*[@id=\"bc\"]/nav/ul/li[1]/a"));
				element.click();
				
				//Click eBay Money Back Guarantee button
		        element = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[3]/a"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("//a[contains(@href,'ebay.com')]"));
				element.click();
				
				 //Click Bidding & buying help button
		        element = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[4]/a"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("//*[@id=\"bc\"]/nav/ul/li[1]/a"));
				element.click();
				
				//Click Stores button
		        element = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[5]/a"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/nav/ul/li[1]/a/span"));
				element.click();
				
				System.out.println("pass");
				
	}

}
