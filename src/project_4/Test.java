package project_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test {
  static String baseUrl = "https://www.saucedemo.com/";

    public static void main(String[] args) throws InterruptedException {
        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open the url into thr browser
        driver.get(baseUrl);

        //maximize the browser
        driver.manage().window().maximize();

        //give implicit time to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //get current url
        String current = driver.getCurrentUrl();
        System.out.println("Get current Url " + driver.getCurrentUrl());

        //get page source
        System.out.println(driver.getPageSource());

        //Find username field element and type the username
        WebElement userNameField = driver.findElement(By.name("user-name"));
        userNameField.sendKeys("Standard_user");
        Thread.sleep(2000);

        //Find password field element and type the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");
        Thread.sleep(2000);

        //click on login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        Thread.sleep(2000);

        //get current url
        String loginUrl = "https://www.saucedemo.com/inventory.html";
        driver.navigate().to(loginUrl);
        System.out.println(loginUrl);

        //back to homepage
        driver.navigate().back();
        Thread.sleep(2000);

        //refresh the page
        driver.navigate().refresh();
        Thread.sleep(2000);

        //close the browser
        driver.quit();


    }
}
