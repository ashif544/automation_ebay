package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automation_all_popular_catagories {

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
		
		//click sneakers button
		
		element = driver.findElement(By.xpath("//*[@id=\"destinations_list2\"]/ul/li[1]/a/h3"));
		element.click();
		
		
		
		//Click Back button
		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/nav/ul/li[1]/a/span"));
		element.click();
		

		//click Korean beauty button
		
		element = driver.findElement(By.xpath("//*[@id=\"destinations_list2\"]/ul/li[2]/a/h3"));
		element.click();
		
		//Click Back button
				element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/nav/ul/li[1]/a/span"));
				element.click();
				
				//click Wrist Watches button
				
				element = driver.findElement(By.xpath("//*[@id=\"destinations_list2\"]/ul/li[3]/a/h3"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/nav/ul/li[1]/a/span"));
				element.click();
				
				//click Fishing button
				
				element = driver.findElement(By.xpath("//*[@id=\"destinations_list2\"]/ul/li[4]/a/h3"));
				element.click();
				
				//Click Back button
						element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/nav/ul/li[1]/a/span"));
						element.click();
						
						//click Collectibles button
						
						element = driver.findElement(By.xpath("//*[@id=\"destinations_list2\"]/ul/li[5]/a/h3"));
						element.click();
						
						//Click Back button
								element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/nav/ol/li[1]/a"));
								element.click();
								
								//click Smartphones button
								
								element = driver.findElement(By.xpath("//*[@id=\"destinations_list2\"]/ul/li[6]/a/h3"));
								element.click();
								
								//Click Back button
										element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/nav/ul/li[1]/a/span"));
										element.click();
										
										//click Sell button
										
										element = driver.findElement(By.xpath("//*[@id=\"destinations_list2\"]/ul/li[7]/a/h3"));
										element.click();
										
										System.out.println("Pass");

	}

}
