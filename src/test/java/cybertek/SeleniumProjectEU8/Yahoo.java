package cybertek.SeleniumProjectEU8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com/");
        String title = driver.getTitle();

        if(title.equals("Yahoo")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }


        driver.quit();

    }
}
