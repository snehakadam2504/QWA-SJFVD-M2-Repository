package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://laptop-4vd9ha0r/login.do");
	    WebElement username =driver.findElement(By.name("username"));
	    
	    Point location= username.getLocation();
	    
	    System.out.println(location);
	    
	    
	     

	}

}
