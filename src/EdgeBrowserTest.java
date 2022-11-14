import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //Object for edge
        WebDriver driver = new EdgeDriver();

        //Launch URL
        driver.get(baseUrl);

        //Maximise Window
        driver.manage().window().maximize();

        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Page source:" +driver.getPageSource());

        //Find email link element
        WebElement emailField = driver.findElement(By.id("Email"));

        //Type email to email field
        emailField.sendKeys("Hiren123@test.com");

        //Find password field
        WebElement passwordField = driver.findElement(By.name("Password"));

        //Type password in password field
        passwordField.sendKeys("Password123");

        //Close the browser
        driver.quit();








    }
}
