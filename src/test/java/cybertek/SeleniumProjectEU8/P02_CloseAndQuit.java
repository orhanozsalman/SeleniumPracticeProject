package cybertek.SeleniumProjectEU8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        //set up chrome and create Webdriver instance

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to a practice page open an new tab
        //this pricatice url will opem and wait 3 secconds and open a new tab

        driver.get("https://practice.cydeo.com/open_new_tab");

        //wait 5 seconds
        Thread.sleep(5000);

        //closing the any current tab
        driver.close();

        //close all browser window opened by driver
        driver.quit();

    }
}
