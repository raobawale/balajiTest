package browserLaunching_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Learning {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		Thread.sleep(1000);
		dr.get("https://www.facebook.com/");
		Thread.sleep(1000);

		// Types of locators

		// dr.findElement(By.xpath("//input[@id='email']")).sendKeys("7066 11 71 77") ;			

		// dr.findElement(By.xpath("//input [@type='text' or name='email' or id='email'
		// ] ")).sendKeys("7066 11 71 77");
		
		

		// dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");

		// dr.findElement(By.xpath("//input[@type='password' or name='pass' or id='pass'
		// ]")).sendKeys("12345678");
		
		dr.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("7066117177");
		dr.findElement(By.xpath("//input[@data-testid='royal-pass']")).sendKeys("12345678");
		dr.findElement(By.xpath("//button[@data-testid=\"royal-login-button\"]")).click();
		
	

	//	dr.findElement(By.xpath("(//a[contains(text(), 'Meta')])[5]")).click();
		// dr.findElement(By.xpath("//a[text()='Meta AI']")).click();
		// dr.findElement(By.xpath("//a[contains(text(), 'Facebook Lite')]")).click();
		// dr.findElement(By.xpath("//button[@name='login']")).click();
		// dr.findElement(By.xpath("//a[text()= 'Forgotten password?']")).click();

		Thread.sleep(1000);
		dr.manage().window().minimize();
		dr.quit();
	}

}
