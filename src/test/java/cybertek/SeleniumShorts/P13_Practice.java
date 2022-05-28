package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P13_Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        driver.manage().window().maximize();

        String title = driver.getTitle();

        WebElement usernameBox = driver.findElement(By.id("user-name"));
        usernameBox.sendKeys("standard_user");

        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.submit();

        WebElement firstProductLnk = driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println("firstProductLnk.getAttribute(\"id\") = "
                          + firstProductLnk.getAttribute("id"));

        WebElement firstProductLink1 = driver.findElement(By.className("inventory_item_name"));
        System.out.println("firstProductLink1.getText() = "
                + firstProductLink1.getText());

        WebElement firstProductLink2 = driver.findElement(By.id("item_4_title_link"));
        System.out.println("firstProductLink2.getText() = "
                          + firstProductLink2.getText());

        List<WebElement> allProductTitle = driver.findElements(By.className("inventory_item_name"));

        System.out.println("Product count is = " + allProductTitle.size());

        for (WebElement eachProductTitle: allProductTitle) {
            String productTitleText =eachProductTitle.getText();
            System.out.println("productTitleText = " + productTitleText);
        }

        WebElement cartContainer =driver.findElement(By.id("shopping_cart_container"));
        cartContainer.click();

        Thread.sleep(5000);

        WebElement continueShopping =driver.findElement(By.id("continue-shopping"));
        continueShopping.click();




        //driver.quit();

    }
}
