package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_BasicNavigation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //navigate.url
        driver.get("https://google.com");

        //navigate back
        driver.navigate().back();

        //navigate forward
        driver.navigate().forward();

        //navigate refresh
        driver.navigate().refresh();





    }
}
