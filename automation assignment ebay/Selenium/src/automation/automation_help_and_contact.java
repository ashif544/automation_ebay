package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automation_help_and_contact {

	public static void main(String[] args) {
		WebDriver driver = Main.getDriver();

		//Navigation Website
				
				driver.get("https://www.google.com");
				
				//Find signin button
				
				WebElement element = driver.findElement(By.name("q"));
				element.sendKeys("https://www.ebay.com/");
				
				element = driver.findElement(By.name("btnK"));
				element.click();
				
				element = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3"));
				element.click();
				
				element = driver.findElement(By.xpath("//*[@id=\"gh-p-3\"]/a"));
				element.click();
				
				WebElement page_header = driver.findElement(By.xpath("//*[@id=\"gh-title\"]"));
				String header_Text = page_header.getText();
				
				if(header_Text.equals("Customer Service")) {
					System.out.println("Pass");
					
				}
				else{
					System.out.println("fail");
				}

				

	}

}
