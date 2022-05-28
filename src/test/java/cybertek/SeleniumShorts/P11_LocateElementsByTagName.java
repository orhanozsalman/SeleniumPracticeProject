package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P11_LocateElementsByTagName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to the site
        driver.get("https://practice.cybertekschool.com");

        //identify and save the first element with <a> tag
        WebElement text = driver.findElement(By.tagName("a"));

        //print out the text
        System.out.println("text.getText() = "
                             + text.getText());

        //identify and  save all the elements with <a> tag
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        //iterate over this list and get the text of all the link WebElement
        for(WebElement eachLink : allLinks){

            System.out.println(" Link TExt is " + eachLink.getText());

        }

        //Click on the link
        text.click();


        driver.quit();
    }
}
