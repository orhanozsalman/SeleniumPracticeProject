package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P00_SeleniumDryRun {

    public static void main(String[] args) {

        //1- set up chrome driver

        WebDriverManager.chromedriver().setup();

        //2- Create web driver instance that point to chrome

        WebDriver driver = new ChromeDriver();

        //3- navigate to website

        driver.navigate().to("https://google.com");






    }

}
