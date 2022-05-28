package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P06_LocateElementsById {
    public static void main(String[] args) {
        
    

     //1- set up web drive manager

       WebDriverManager.chromedriver().setup();

      //2- create instance of the chrome driver

       WebDriver driver = new ChromeDriver();

       driver.manage().window().maximize();
       //make the window maximized

        driver.get("https:www.google.com");

        //istedigimiz sayfaya gitmek icin

        WebElement luckyText = driver.findElement(By.id("gNO89b"));

        //value attribute

        String text = luckyText.getAttribute("value");

        if (text.equals("I'm feeling Lucky")){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }




    }


}
