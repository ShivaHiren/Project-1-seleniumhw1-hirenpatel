import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //object of chrome driver
        WebDriver driver = new ChromeDriver();

        //Launch URL
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);

        //Get current URL
        System.out.println("Current URL; " + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page Source:" + driver.getPageSource());

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
