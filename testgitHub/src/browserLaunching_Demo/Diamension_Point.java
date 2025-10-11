package browserLaunching_Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Diamension_Point {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        System.out.println("Page Title: " + driver.getTitle());

        // Step 1: Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(1000);

        // Step 2: Print current window size and position
        Dimension currentSize = driver.manage().window().getSize();
        Point currentPosition = driver.manage().window().getPosition();
        System.out.println("Current Size: " + currentSize);
        System.out.println("Current Position: " + currentPosition);

        // Step 3: Change window size
        Dimension newSize = new Dimension(500, 500);
        driver.manage().window().setSize(newSize);
        Thread.sleep(1000);
        System.out.println("New Size Set To: " + newSize);

        // Step 4: Change window position
        Point newPosition = new Point(600, 100);
        driver.manage().window().setPosition(newPosition);
        Thread.sleep(1000);
        System.out.println("New Position Set To: " + newPosition);

        // Step 5: Again print updated size and position
        System.out.println("Updated Size: " + driver.manage().window().getSize());
        System.out.println("Updated Position: " + driver.manage().window().getPosition());

        // Step 6: Restore window to full screen
        driver.manage().window().maximize();
        Thread.sleep(1000);
        System.out.println("Window maximized again!");

        driver.close();
    }
    
//    💡What this does:
//
//    	✅ Opens Amazon
//    	✅ Maximizes window
//    	✅ Prints the current size and position
//    	✅ Resizes and moves the window
//    	✅ Prints the new size and position
//    	✅ Maximizes again and closes

}
