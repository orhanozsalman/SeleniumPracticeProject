package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_GettingPageTitle {
    public static void main(String[] args) {


        //set up chrome and create Webdriver instance

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to google and print out the title


        driver.get("https://cydeo.com");

        String title = driver.getTitle();
        System.out.println("Title of the page: " +title );


        if(title.equals("Cydeo")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }


        driver.quit();


    }
}
