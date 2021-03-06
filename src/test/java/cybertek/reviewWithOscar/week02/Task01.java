package cybertek.reviewWithOscar.week02;

import cybertek.utilities.HandleWait;
import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task01 {
    public static void main(String[] args) {
// open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
// maximize your page
        driver.manage().window().maximize();
// go to https://practice.cydeo.com/    driver.get(url) ---> to navigate to a website
        driver.get("https://practice.cydeo.com/");

        // then click on "forgot_password" link
     /*
     2 ways of using webElelements : long way or lazy way
      */

        HandleWait.staticWait(1);
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password"));
        forgotPasswordLink.click();
        // enter any email
        WebElement emailBox= driver.findElement(By.name("email"));

        String expectedEmail = "mike.smith@garbage.com";

        emailBox.sendKeys(expectedEmail);

// verify that email is displayed in the input box

        //   String actualEmail = emailBox.getText(); // let's see if it works?
        // not in the text of the element, it is at the 'value' attribute of the webElement
        String actualEmail = emailBox.getAttribute("value"); // let's see if it works?

        // verify the test
        if(actualEmail.equalsIgnoreCase(expectedEmail)){
            System.out.println("PASS email verification");
        }else {
            System.out.println("FAILED email verification");
            System.out.println("actualEmail = " + actualEmail);
            System.out.println("expectedEmail = " + expectedEmail);
        }

    }
}

/*open chrome browser
        go to https://practice.cydeo.com/
        then click on "forgot_password" link
        enter any email
        verify that email is displayed in the input box
        click on Retrieve password
        verify that confirmation message says 'Your e-mail's been sent!'*/