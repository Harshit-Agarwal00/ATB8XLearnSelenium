package org.example.ActionWindow_Frame;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action1 {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }

    @Description("Verify actions")
    @Test
    public void test_actions() throws InterruptedException {

        driver.manage().window().maximize();
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.name("firstname"));

        Actions actions  = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstName,"the testing academy").keyUp(Keys.SHIFT).build().perform();

        Thread.sleep(3000);
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
