package browserLaunching_Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.time.Duration;

public class WebdriverMethods_FineTuned {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);
        
      
        driver.get("https://www.facebook.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        driver.navigate().to("https://www.amazon.in/");
        System.out.println("Navigated to Amazon: " + driver.getTitle());

        driver.navigate().back();
        System.out.println("Back to: " + driver.getTitle());

        driver.navigate().forward();
        System.out.println("Forward to: " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Page refreshed!");

        driver.close();
    }

}
