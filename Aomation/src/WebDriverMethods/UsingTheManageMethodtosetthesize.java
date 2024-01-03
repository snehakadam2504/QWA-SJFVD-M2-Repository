package WebDriverMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTheManageMethodtosetthesize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d =new Dimension(100,200);
		
		driver .manage().window().setSize(null);
		
		
		
	}

}
