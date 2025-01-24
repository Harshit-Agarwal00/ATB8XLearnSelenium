package org.example.ex04_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium20 {

    @Test
    public void testMethod01() throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.id("sex-1")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
