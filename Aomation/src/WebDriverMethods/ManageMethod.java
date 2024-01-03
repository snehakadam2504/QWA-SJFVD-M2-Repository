package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException { 
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
	driver.close();
		
	    
	   
		
		//Thread.sleep(200);
		
		//point(taegetPosition)=new Point(450,250);
		
		//driver.manage().window().setposition(targetposition);
		
		
		

	}

}



