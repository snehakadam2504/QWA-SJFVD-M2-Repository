package Assingment;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class QspiderDemoLoginPage {

	public static void main(String[] args) throws InterruptedException {
			
			
     WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("");
	 driver.findElement(By.cssSelector("[name='name']")).sendKeys("Sneha");
	 driver.findElement(By.cssSelector("[name='email']")).sendKeys("sneha@gmail.com");
	 
	 driver.findElement(By.cssSelector("[name='password']")).sendKeys("sneha123");
	 Thread.sleep(2000);
	 driver.findElement(By.linkText( "Login Now")).click();
	  
	 driver.quit();
			

}
}