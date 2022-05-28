package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P15_LocatingRadioButtons {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        System.out.println("blueRadioButton.isSelected() = "
                          + blueRadioButton.isSelected());

        blueRadioButton.click();

        WebElement redRadioButton = driver.findElement(By.id("red"));
        System.out.println("Before clicked redRadioButton.isSelected() = "
                          + redRadioButton.isSelected());

        redRadioButton.click();

        System.out.println("After clicked redRadioButton.isSelected() = "
                + redRadioButton.isSelected());

        // check the blue is not selected
        System.out.println("After selecting red = blueRadioButton.isSelected() = "
                + blueRadioButton.isSelected());

        //identify green radio button

        WebElement greenRadioButton = driver.findElement(By.id("green"));
        System.out.println("Before clicked greenRadioButton.isSelected() = "
                + greenRadioButton.isSelected());

        System.out.println("greenRadioButton.isSelected() = "
                           + greenRadioButton.isSelected());

        System.out.println("greenRadioButton.isEnabled() = "
                          + greenRadioButton.isEnabled());

        List<WebElement> allColorRadios = driver.findElements(By.name("color"));
        System.out.println("allColorRadios.size() = "
                + allColorRadios.size());


        for (WebElement eachRadioButton : allColorRadios) {
            System.out.println("current radio button eachRadioButton.getAttribute(\"id\") = "
                              + eachRadioButton.getAttribute("id"));
            System.out.println("is it enabled? eachRadioButton.isEnabled() = "
                              + eachRadioButton.isEnabled());
            System.out.println(" is it selected? eachRadioButton.isSelected() = "
                              + eachRadioButton.isSelected());
        }


        driver.quit();

    }
}
