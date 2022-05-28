package cybertek.reviewWithOscar.week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToDemoBlaze {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");

        // driver.navigate().to("https://www.demoblaze.com/");  daha cok get methodu kullaniyoruz

        String expectedTitle="STORE";
        String actualTitle = driver.getTitle();

    }
}
