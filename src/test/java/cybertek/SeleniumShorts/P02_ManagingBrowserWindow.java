package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_ManagingBrowserWindow {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        //maximize
        driver.manage().window().maximize();

        //fullscreen
        driver.manage().window().fullscreen();

        //position setter
        driver.manage().window().setPosition(new Point(300, 200));

        //get the current position of the window
        System.out.println("driver.manage().window().getPosition() = "
                            + driver.manage().window().getPosition());

        //change the window size dimension
        driver.manage().window().setSize(new Dimension(200,300));

        //get the size of the window
        System.out.println("driver.manage().window().getSize() = "
                                + driver.manage().window().getSize());


        System.out.println("THE END");



    }
}
