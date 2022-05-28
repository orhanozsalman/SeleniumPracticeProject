package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_LocatingCheckboxes {

    public static void main(String[] args) throws InterruptedException {

        //setup
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //navigate
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println("Before clicked checkbox1.isSelected() = "
                          + checkbox1.isSelected());


        checkbox1.click();
        System.out.println("After clicked checkbox1.isSelected() = "
                          + checkbox1.isSelected());

        WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println("Before clicked checkbox2.getAttribute(\"checked\") = "
                        + checkbox2.getAttribute("checked"));

        Thread.sleep(3000);

        checkbox2.click();

        System.out.println("After clicked checkbox2.getAttribute(\"checked\") = "
                + checkbox2.getAttribute("checked"));

        if (! checkbox1.isSelected()){
            checkbox1.click();
        }else{
            System.out.println("checkbox 1 is already selected");
        }


    }
}
