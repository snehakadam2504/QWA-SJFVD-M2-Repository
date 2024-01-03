package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://laptop-4vd9ha0r/login.do");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	}

}
