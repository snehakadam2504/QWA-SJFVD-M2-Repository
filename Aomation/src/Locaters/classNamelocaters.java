package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNamelocaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch the browser
      WebDriver driver =new ChromeDriver();
      //max the browser
      driver.manage().window().maximize();
      //launch we application
      driver.get("https://www.google.com");
      //
      driver.switchTo().activeElement().sendKeys("phoebe buffay",Keys.ENTER);
      driver.findElement(By.className("lNPNe")).click();
	}

}
