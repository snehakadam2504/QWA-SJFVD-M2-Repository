package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitelMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       //to launch the web application
	 
		 WebDriver driver=new ChromeDriver();
		 //to maximize the browser
		 driver.manage().window().maximize();
		 // to open web application
		 driver.get("https://www.flipkart.com/");
		 //to feach the url
		 String actualTitel = driver.getTitle();
		 
		 
		
	}

}
