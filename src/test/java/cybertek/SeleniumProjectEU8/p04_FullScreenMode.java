package cybertek.SeleniumProjectEU8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p04_FullScreenMode {

    public static void main(String[] args) {

        //1- set up web drive manager

        WebDriverManager.chromedriver().setup();

        //2- create instance of the chrome driver

        WebDriver driver = new ChromeDriver();

        driver.get("https:www.google.com");
        //istedigimiz sayfaya gitmek icin

        //3-navigate.to(url)

        driver.navigate().to("https:www.google.com");
        //driver.get

        driver.manage().window().maximize();
             //alttaki tum ekrani kapliyor ama ustteki kenarlari birakiyo
        driver.manage().window().fullscreen();
    }
}
