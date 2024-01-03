package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelecteted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://laptop-4vd9ha0r/login.do");
	     WebElement username =driver.findElement(By.xpath("//input[@name='remember']"));
	     checkbox.click();
	     {
	    	 System.out.println("login button is displayed");
	     }

	}

}
