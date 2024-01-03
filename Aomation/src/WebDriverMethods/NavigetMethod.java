package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigetMethod {
	public static void main(String[] args) throws InterruptedException {
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		//to max 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/india");
		//to navigate the application
		driver.navigate().to("https://www.swiggy.com/");
	    //to back
		driver.navigate().back();
		//Thread.sleep(2000);
		//to forward
		driver.navigate().forward();
		//Thread.sleep(2000);
		//to refresh
		driver.navigate().refresh();
		driver.quit();
		
	}

}
