package Assingment;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             //launch the browser
		      WebDriver driver =new ChromeDriver();
		      //max the browser
		      driver.manage().window().maximize();
		      //launch we application
		      driver.get("https://www.instagram.com");
		      //
		      driver.switchTo().activeElement().sendKeys("phoebe buffay"

	}

}
