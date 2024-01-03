package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingVisibleText {
	public static void main(String[] args) {
		
		
        //to launch the browser
		
		WebDriver driver=new ChromeDriver();
		//MAX THE BROWSER
		driver.manage().window().maximize();
		//to launch the web application
		driver.get("https://www.flipkart.com/");
		//
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.quit();
	}

}
