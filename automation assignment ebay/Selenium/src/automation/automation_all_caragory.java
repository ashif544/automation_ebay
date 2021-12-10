package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automation_all_caragory {

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
		
		        //Click Electronics button
		        element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/nav/ol/li[1]/a"));
				element.click();
				
               //Click Fation button
				element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/nav/ol/li[1]/a"));
				element.click();
				
				//Click Health and Beauty button
				element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/nav/ul/li[1]/a/span"));
				element.click();
				
				//Click Home And Garden button
				element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/nav/ul/li[1]/a/span"));
				element.click();
				
				//Click Sports button
				element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/nav/ul/li[1]/a/span"));
				element.click();
				
				//Click Collectibles and Art button
				element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/nav/ol/li[1]/a"));
				element.click();

				//Click Industrial equipment button
				element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a"));
				element.click();
				
				//Click Back button
				element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/nav/ul/li[1]/a/span"));
				element.click();
				
				//Click Motors button
				element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a"));
				element.click();
				
			System.out.println("pass");
	}

}
