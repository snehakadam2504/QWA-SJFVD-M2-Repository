package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://laptop-4vd9ha0r/login.do");
	     WebElement username =driver.findElement(By.name("username"));
	     Rectangle rect=username.getRect();
	     int hight=rect.getHeight(); 
	     int width=rect.getWidth();
	     int x=rect.getX();
	     int y=rect.getY();
	     System.out.println(hight);
	     System.out.println(width);
	     System.out.println(x);
	     System.out.println(y);

	    

	}

}
