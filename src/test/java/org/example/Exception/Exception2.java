package org.example.Exception;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exception2 {

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }

    @Description("Verify Stale Element Reference Exception")
    @Test
    public void test_actions(){
        try {
            driver.get("https://google.com");
            WebElement search_inputbox  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            driver.navigate().refresh();
            // HTML Page (DOM) is not refreshed,
            // Driver will think that, element may or may not available now.
            // I have found the element before refresh.
            // Refresh, Navigate other Page, change in DOM elements (Ajax Calls) - VueJS, AngularJS
            search_inputbox.sendKeys("thetestingacademy"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }
     
    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
