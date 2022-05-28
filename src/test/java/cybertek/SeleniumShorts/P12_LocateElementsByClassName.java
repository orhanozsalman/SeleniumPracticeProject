package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_LocateElementsByClassName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        WebElement feelingLucky= driver.findElement(By.className("RNmpXc"));

        if(feelingLucky.getText().equals("Ме следи среќа")){
            System.out.println("Text appears correctly");
        }else{
            System.out.println("Text is incorrect.");
        }



    }
}
