package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocaters {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify the email id
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("sneha.more2504@gamil.com");
		Thread.sleep(2000);

		//Identify the password


		driver.findElement(By.id("passContainer")).sendKeys("sneha@123");
		
	}

}
