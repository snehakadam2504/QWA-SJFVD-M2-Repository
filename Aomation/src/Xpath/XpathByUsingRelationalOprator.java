package Xpath;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class XpathByUsingRelationalOprator {


	
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
			driver.findElement(By.xpath("/input/[@placeholder='Password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'and@name='username']"));
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
			driver.quit();

			

		}

	}



